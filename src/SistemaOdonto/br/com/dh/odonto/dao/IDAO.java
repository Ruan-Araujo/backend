package SistemaOdonto.br.com.dh.odonto.dao;

import java.util.List;
import java.util.Optional;

public interface IDAO<T> {

    T salvar(T t);
    Optional<T> buscar(Integer id);
    void excluir(Integer id);
    List<T> buscarTodos();

}
