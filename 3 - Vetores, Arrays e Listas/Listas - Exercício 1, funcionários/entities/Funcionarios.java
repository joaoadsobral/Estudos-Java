package entities;

public class Funcionarios {
    private Integer ID;
    private String nome;
    private Double salario;

    public Funcionarios(int ID, String nome, double salario) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalarial(double porcentagem) {
        this.salario += this.salario * porcentagem / 100.0;
    }

    public String toString() {
         return ID
                + ", "
                + nome + ", "
                + String.format("%.2f", salario);
    }
}
