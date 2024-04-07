package entities;

public class Funcionario {

    public String nome;
    public double salariobruto;
    public double imposto;

    public double Taxas(){
        return salariobruto - imposto;
    }

    public double Calculadora(double taxa){
        return salariobruto += salariobruto * taxa / 100.0;
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f", Taxas());
    }
}
