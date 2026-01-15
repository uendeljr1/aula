package dao;

import entities.Departamento;

import java.util.List;

public interface DepartamentoDao {
    void inserir(Departamento departamento);
    void atualizar(Departamento departamento);
    void excluir(Departamento departamento);
    Departamento buscar(Integer id);
    List<Departamento> buscarTodos();
}
