public class Caminhao extends Transporte{

    public Caminhao(Carga carga){
        super(carga);
    }

    public Caminhao(){}

    public double calculaFrete(int distancia){
        double frete;
        double valorPeso = 0.02*this.carga.getPeso();
        double valorCarga = 0.03*this.carga.getValor();
        double valorDistancia = 2 * distancia;

        frete = valorPeso + valorCarga + valorDistancia;

        if(this.carga.getValor()>40000){
            double desconto = 0.25*frete;

            frete-=desconto;
        }

        return frete;
    }
}
