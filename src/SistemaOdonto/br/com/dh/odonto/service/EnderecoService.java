package SistemaOdonto.br.com.dh.odonto.service;

import SistemaOdonto.br.com.dh.odonto.dao.IDAO;
import SistemaOdonto.br.com.dh.odonto.model.Endereco;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    private IDAO<Endereco> enderecoIDAO;

    public EnderecoService(IDAO<Endereco> enderecoIDAO) {
        this.enderecoIDAO = enderecoIDAO;
    }

    public Endereco salvar(Endereco endereco) {
        enderecoIDAO.salvar(endereco);
        return endereco;
    }

    public Optional<Endereco> buscar(Integer id) {
        return enderecoIDAO.buscar(id);
    }

    public List<Endereco> buscarTodos() {
        return enderecoIDAO.buscarTodos();
    }

    public void excluir(Integer id) {
        enderecoIDAO.excluir(id);
    }

}
