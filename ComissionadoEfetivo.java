package br.ifc;

public class ComissionadoEfetivo extends Comissionado{
    
    private double salarioBase;

    public ComissionadoEfetivo(double salarioBase, double totalVendas, double perct, int id, String nome) {
        super(totalVendas, perct, id, nome);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        super.salario = super.calcularSalario() + this.salarioBase;
        return super.salario;
    }
}
