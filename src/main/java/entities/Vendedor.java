package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedor implements Serializable {
    private Integer idVendedor;
    private String nome;
    private String email;
    private Date dataNascimento;
    private Double salarioBase;

    private Departamento departamento;
    public Vendedor() {

    }

    public Vendedor(Date dataNascimento, Departamento departamento, String email, Integer idVendedor, String nome, Double salarioBase) {
        this.dataNascimento = dataNascimento;
        this.departamento = departamento;
        this.email = email;
        this.idVendedor = idVendedor;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(idVendedor, vendedor.idVendedor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idVendedor);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "dataNascimento=" + dataNascimento +
                ", idVendedor=" + idVendedor +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salarioBase=" + salarioBase +
                ", departamento=" + departamento +
                '}';
    }
}
