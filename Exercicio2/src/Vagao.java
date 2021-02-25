public class Vagao extends Transporte{

    public Vagao(Carga carga){
        super(carga);
    }


    public double calculaFrete(int distancia){
        double frete;
        double valorPeso = 0.07*this.carga.getPeso();
        double valorCarga = 0.01*this.carga.getValor();
        double valorDistancia = 0.50 * distancia;

        frete = valorPeso + valorCarga + valorDistancia;

        if(this.carga.getPeso() < 15000){
            frete+=5000;
        }

        return frete;
    }
}
