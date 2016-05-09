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
public class RepresentanteComercial extends Funcionario {
    // Atributos
    private double percentual, ajuda_mensal;
    
    // Método que calcula o salário líquido do Representante Comercial
    @Override
    public double calcularSalarioLiquido() {
        /* A descrição do cálculo do salário desse tipo de funcionário nos Requisitos está confusa, 
         por isso retornei apenas o salário bruto 
        */
        return super.getSalarioBruto();
    }
    
    // Getters e Setters
    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getAjudaMensal() {
        return ajuda_mensal;
    }

    public void setAjudaMensal(double ajuda_mensal) {
        this.ajuda_mensal = ajuda_mensal;
    }
}
