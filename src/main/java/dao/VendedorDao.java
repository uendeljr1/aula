package dao;

import entities.Departamento;

import java.util.List;

public interface VendedorDao {
    void inserir(Departamento departamento);
    void atualizar(Departamento departamento);
    void excluir(Integer id);
    Departamento buscar(Integer id);
    List<Departamento> buscarTodos();
}
