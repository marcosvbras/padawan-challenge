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
public class FuncionarioDeDiretoria extends Funcionario {
    // Atributos
    private double percentual, lucro_mensal;
    private int faltas;
    
    // Método que calcula o salário líquido do Funcionário de Diretoria
    @Override
    public double calcularSalarioLiquido() {
        double desconto = super.getSalarioBruto() / 30 * faltas;
        double salario_liquido = super.getSalarioBruto() + (lucro_mensal * percentual / 100) - desconto;
        
        return salario_liquido;
    }
    
    // Getters e Setters
    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    public double getLucroMensal() {
        return lucro_mensal;
    }

    public void setLucroMensal(double lucro_mensal) {
        this.lucro_mensal = lucro_mensal;
    }
    
    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
