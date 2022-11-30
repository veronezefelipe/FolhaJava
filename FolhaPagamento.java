package br.ifc;

import java.util.List;

public class FolhaPagamento {
    
    public static double gerarFolha(List<Funcionario> funcionarios){
        double totalFolha = 0;
        for (Funcionario f : funcionarios) {
            totalFolha += f.calcularSalario();
        }
        
        return totalFolha;
    }
}
