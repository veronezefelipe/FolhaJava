package br.ifc;

public class Comissionado extends Funcionario{
    
    private double totalVendas;
    //valor: 0.1 = 10%
    private double perct;

    public Comissionado(double totalVendas, double perct, int id, String nome) {
        super(id, nome);
        this.totalVendas = totalVendas;
        this.perct = perct;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPerct() {
        return perct;
    }

    public void setPerct(double perct) {
        this.perct = perct;
    }

    @Override
    public double calcularSalario() {
        super.salario = this.totalVendas * this.perct;
        return super.salario;
    }
    
    
}
