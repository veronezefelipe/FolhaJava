package br.ifc;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        MensalFixo mf1 = new MensalFixo(1000, 1, "Vero");
        Horista h1 = new Horista(45, 50, 1500, 2, "Teco" );
        Comissionado c1 = new Comissionado(50000, 0.1, 3, "Teta");
        ComissionadoEfetivo ce1 = new ComissionadoEfetivo(1500, 50000, 0.1, 4, "Trzcinski");
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(mf1);
        funcionarios.add(h1);
        funcionarios.add(c1);
        funcionarios.add(ce1);
        
        double folha = FolhaPagamento.gerarFolha(funcionarios);
        System.out.println("A folha do mês é de: R$" + folha);
        
    }
}
