package entities;


public class Conta {

    private int numero_conta;
    private String nome;
    private double deposito;

    public Conta(int numero_conta, String nome, double depositoInicial){
        this.numero_conta = numero_conta;
        this.nome = nome;
        entrada(depositoInicial);
    }

    public Conta(int numero_conta, String nome){
        this.numero_conta = numero_conta;
        this.nome = nome;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void entrada(double deposito){
        this.deposito += deposito;
    }

    public void retirada(double retirada){
        deposito -= retirada + 5;
    }

    public String toString(){
        return "Account : " +  numero_conta + ", Holder: " + nome + ", Balance: " + "$ "+ String.format("%.2f%n", deposito);
    }
}
