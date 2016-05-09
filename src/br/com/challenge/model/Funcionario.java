/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.challenge.model;

/**
 *
 * @author Marcos
 */
public abstract class Funcionario {
    // Atributos
    private int matricula;
    private String nome, cargo, cpf, endereco, email;
    private double salario_bruto;
    
    // Construtores
    public Funcionario() {}
    
    public Funcionario(int matricula, String nome, String cargo, String cpf, String endereco, String email, Double salario_bruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.salario_bruto = salario_bruto;
    }
    
    // Método de cálculo do salário líquido
    public abstract double calcularSalarioLiquido();
    
    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBruto() {
        return salario_bruto;
    }

    public void setSalarioBruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }
}
