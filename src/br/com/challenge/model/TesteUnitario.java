/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.challenge.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class TesteUnitario {

    public static void main(String[] args) {
        int op;
        FuncionarioDeCampo funCamp;
        FuncionarioDeDiretoria funDir;
        RepresentanteComercial repCom;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Cálculo de salário de Funcionário de Campo"
                    + "\n2 - Cálculo de salário de Funcionário de Diretoria"
                    + "\n3 - Cálculo de salário de Representantes Comerciais"
                    + "\n4 - Sair"
                    + "\n\nOpção desejada: "));

            if (op == 1) {
                funCamp = new FuncionarioDeCampo();
                funCamp.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula: ")));
                funCamp.setNome(JOptionPane.showInputDialog("Digite o nome: "));
                funCamp.setCargo(JOptionPane.showInputDialog("Digite o cargo: "));
                funCamp.setCpf(JOptionPane.showInputDialog("Digite o cpf: "));
                funCamp.setEndereco(JOptionPane.showInputDialog("Digite o endereço: "));
                funCamp.setEmail(JOptionPane.showInputDialog("Digite o e-mail: "));
                funCamp.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário bruto: ")));
                funCamp.setAdicional(Double.parseDouble(JOptionPane.showInputDialog("Digite o adicional mensal por periculosidade: ")));
                funCamp.setValeAlimentacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do vale alimentação: ")));
                funCamp.setValeTransporte(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do vale transporte: ")));
                funCamp.setFaltas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas: ")));
                funCamp.setHorasExtras(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas extras: ")));
                JOptionPane.showMessageDialog(null, "Salário Líquido: R$ " + funCamp.calcularSalarioLiquido());
            } else if (op == 2) {
                funDir = new FuncionarioDeDiretoria();
                funDir.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula: ")));
                funDir.setNome(JOptionPane.showInputDialog("Digite o nome: "));
                funDir.setCargo(JOptionPane.showInputDialog("Digite o cargo: "));
                funDir.setCpf(JOptionPane.showInputDialog("Digite o cpf: "));
                funDir.setEndereco(JOptionPane.showInputDialog("Digite o endereço: "));
                funDir.setEmail(JOptionPane.showInputDialog("Digite o e-mail: "));
                funDir.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário bruto: ")));
                funDir.setPercentual(Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual sobre lucro: ")));
                funDir.setLucroMensal(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lucro mensal da empresa: ")));
                funDir.setFaltas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas: ")));
                JOptionPane.showMessageDialog(null, "Salário Líquido: R$ " + funDir.calcularSalarioLiquido());
            } else if (op == 3) {
                repCom = new RepresentanteComercial();
                repCom.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula: ")));
                repCom.setNome(JOptionPane.showInputDialog("Digite o nome: "));
                repCom.setCargo(JOptionPane.showInputDialog("Digite o cargo: "));
                repCom.setCpf(JOptionPane.showInputDialog("Digite o cpf: "));
                repCom.setEndereco(JOptionPane.showInputDialog("Digite o endereço: "));
                repCom.setEmail(JOptionPane.showInputDialog("Digite o e-mail: "));
                repCom.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário bruto: ")));
                repCom.setPercentual(Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de comissão: ")));
                repCom.setAjudaMensal(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da ajuda mensal: ")));
                JOptionPane.showMessageDialog(null, "Salário Líquido: R$ " + repCom.calcularSalarioLiquido());
            } else if (op < 1 || op > 4) {
                JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente.");
            }
        } while (op != 4);
    }
}
