package SistemaOdonto.br.com.dh.odonto.dao.impl;

import DAO.com.dh.medicamentos.dao.ConfiguracaoJDBC;
import SistemaOdonto.br.com.dh.odonto.dao.IDAO;
import SistemaOdonto.br.com.dh.odonto.model.Endereco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2 implements IDAO<Endereco> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public EnderecoDaoH2() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = String.format(
          "INSERT INTO ENDERECO " +
                  "(rua, numero, cidade, bairro) " +
                  "VALUES ('%s', '%s', '%s', '%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getCidade(),
                endereco.getBairro()
        );

        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();

            if (keys.next()) {
                endereco.setId(keys.getInt(1));
                stmt.close();
                conexao.close();
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return endereco;
    }



    @Override
    public Optional<Endereco> buscar(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = String.format(
                "SELECT id, rua, numero, cidade, bairro " +
                        "FROM enderece WHERE id = '%s'", id
        );

        Endereco endereco = null;

        try {
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()) {
                endereco = criarObjetoEndereco(resultado);
            }

            stmt.close();
            conexao.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return endereco != null ? Optional.of(endereco) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = String.format(
          "DELETE FROM endereco WHERE id = %s", id
        );

        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            conexao.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Endereco> buscarTodos() {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = "SELECT * FROM endereco";

        List<Endereco> enderecos = new ArrayList<>();

        try {
            stmt = conexao.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                enderecos.add(criarObjetoEndereco(result));
            }

            stmt.close();
            conexao.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return enderecos;
    }

    private Endereco criarObjetoEndereco(ResultSet resultado) throws SQLException {
        Integer id = resultado.getInt("id");
        String rua = resultado.getString("rua");
        String numero = resultado.getString("numero");
        String cidade = resultado.getString("cidade");
        String bairro = resultado.getString("bairro");

        return new Endereco(id, rua, numero, cidade, bairro);
    }
}
