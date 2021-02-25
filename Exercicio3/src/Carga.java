public class Carga {
    private double valor;
    private double peso;

    public Carga(double peso, double valor){
        this.valor = valor;
        this.peso = peso;
    }


    //Getters and Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
