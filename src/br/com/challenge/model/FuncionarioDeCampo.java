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
public class FuncionarioDeCampo extends Funcionario {
    // Atributos
    private double adicional, vale_alimentacao, vale_transporte;
    private int faltas, horas_extras;
    
    // Método que calcula o salário líquido do Funcionário de Campo
    @Override
    public double calcularSalarioLiquido() {
        double salario_extra = horas_extras * (super.getSalarioBruto() / 200);
        double desconto = super.getSalarioBruto() / 30 * faltas;
        double salario_liquido = super.getSalarioBruto() + vale_alimentacao + vale_transporte + adicional
                - desconto + salario_extra;
        
        return salario_liquido;
    }   
    
    // Getters e Setters
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public int getHorasExtras() {
        return horas_extras;
    }

    public void setHorasExtras(int horas_extras) {
        this.horas_extras = horas_extras;
    }
    
    public double getValeAlimentacao() {
        return vale_alimentacao;
    }

    public void setValeAlimentacao(double vale_alimentacao) {
        this.vale_alimentacao = vale_alimentacao;
    }
    
    public double getValeTransporte() {
        return vale_transporte;
    }

    public void setValeTransporte(double vale_transporte) {
        this.vale_transporte = vale_transporte;
    }
}
