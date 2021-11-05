package DAO.com.dh.medicamentos.dao;

public interface IDao <T> {

    T salvar(T t);
    T buscar(Integer id);

}
