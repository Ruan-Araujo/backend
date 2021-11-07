package SistemaOdonto.br.com.dh.odonto.dao.impl;

import DAO.com.dh.medicamentos.dao.ConfiguracaoJDBC;
import SistemaOdonto.br.com.dh.odonto.dao.IDAO;
import SistemaOdonto.br.com.dh.odonto.model.Endereco;
import SistemaOdonto.br.com.dh.odonto.model.Paciente;

import SistemaOdonto.br.com.dh.odonto.util.Util;
import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDAO<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;
    private EnderecoDaoH2 enderecoDaoH2;
    final static Logger log = Logger.getLogger(PacienteDaoH2.class);

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC, EnderecoDaoH2 enderecoDaoH2) {
        this.configuracaoJDBC = configuracaoJDBC;
        this.enderecoDaoH2 = enderecoDaoH2;
    }


    @Override
    public Paciente salvar(Paciente paciente) {
        log.debug("Registrando paciente: " + paciente.toString());

        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = String.format(
            "INSERT INTO paciente " +
            "(nome, sobrenome, rg, data_cadastro, endereco_id) " +
            "VALUES ('%s', '%s', '%s', '%s','%s')",

            paciente.getNome(),
            paciente.getSobrenome(),
            Util.dateToTimestamp(paciente.getDataCadastro()),
            paciente.getEndereco().getId());

            try {
                stmt = conexao.createStatement();
                stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet keys = stmt.getGeneratedKeys();

                if (keys.next()) {
                    paciente.setId(keys.getInt(1));
                    stmt.close();
                }
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return paciente;
    }

    @Override
    public Optional<Paciente> buscar(Integer id) {
        log.debug("Buscando paciente com id: " + id);

        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = String.format("SELECT id, nome, sobrenome, rg, " +
                "data_cadastro, endereco_id FROM paciente WHERE id = '%s'", id);

        Paciente paciente = null;

        try {
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()) {
                paciente = criarObjetoPaciente(resultado);
            }

            stmt.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        log.debug("Excluindo paciente com id: " + id);

        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = String.format("DELETE FROM paciente WHERE id = '%s'", id);

        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Paciente> buscarTodos() {
        log.debug("Buscando todos os pacientes");

        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<>();

        try {
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()) {
                pacientes.add(criarObjetoPaciente(resultado));
            }

            stmt.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pacientes;
    }

    private Paciente criarObjetoPaciente(ResultSet result) throws  SQLException {
        Integer idPaciente = result.getInt("id");
        String nome = result.getString("nome");
        String sobrenome = result.getString("sobrenome");
        String rg = result.getString("rg");
        Date dataCadastro = result.getDate("data_cadastro");
        Endereco endereco = enderecoDaoH2.buscar(result.getInt("endereco_id")).orElse(null);
        return new Paciente(idPaciente, nome, sobrenome, rg, dataCadastro, endereco);
    }
}
