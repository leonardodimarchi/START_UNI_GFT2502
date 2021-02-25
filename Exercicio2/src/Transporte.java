public abstract class Transporte {
    Carga carga;

    public Transporte(){}

    public Transporte(Carga carga){
        this.carga = carga;
    }

    public abstract double calculaFrete(int distancia);
}
