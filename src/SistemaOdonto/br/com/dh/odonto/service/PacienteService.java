package SistemaOdonto.br.com.dh.odonto.service;

import SistemaOdonto.br.com.dh.odonto.dao.IDAO;
import SistemaOdonto.br.com.dh.odonto.model.Paciente;

import java.util.List;
import java.util.Optional;

public class PacienteService {

    private IDAO<Paciente> pacienteIDAO;

    public PacienteService(IDAO<Paciente> pacienteIDAO) {
        this.pacienteIDAO = pacienteIDAO;
    }

    public Paciente salvar(Paciente paciente){
        pacienteIDAO.salvar(paciente);
        return paciente;
    }

    public Optional<Paciente> buscar(Integer id) {
        return pacienteIDAO.buscar(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteIDAO.buscarTodos();
    }

    public void excluir(Integer id){
        pacienteIDAO.excluir(id);
    }
}
