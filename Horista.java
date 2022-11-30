package br.ifc;

public class Horista extends MensalFixo {
    
    private double hrsTrabalhadas;
    private double valorHora;

    public Horista(double hrsTrabalhadas, double valorHora, double salarioBase, int id, String nome) {
        super(salarioBase, id, nome);
        this.hrsTrabalhadas = hrsTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHrsTrabalhadas() {
        return hrsTrabalhadas;
    }

    public void setHrsTrabalhadas(double hrsTrabalhadas) {
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    
    @Override
    public double calcularSalario() {
        if(this.hrsTrabalhadas>40)
            super.salario = super.salarioBase + (this.hrsTrabalhadas-40)*this.valorHora;
        else
            super.calcularSalario();
        return super.salario;
    }
    
    
}
