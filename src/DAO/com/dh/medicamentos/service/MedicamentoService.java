package DAO.com.dh.medicamentos.service;

import DAO.com.dh.medicamentos.dao.IDao;
import DAO.com.dh.medicamentos.model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento salvar(Medicamento medicamento) {
        return medicamentoIDao.salvar(medicamento);
    }

    public Medicamento buscar(Integer id) {
        return medicamentoIDao.buscar(id);
    }
}
