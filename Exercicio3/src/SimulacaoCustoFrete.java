import java.util.ArrayList;

public class SimulacaoCustoFrete {
    private ArrayList<Integer> pesos;
    private ArrayList<Integer> valores;
    private ArrayList<Integer> distancias;


    public SimulacaoCustoFrete(ArrayList pesos, ArrayList valores, ArrayList distancias){
        this.pesos = pesos;
        this.valores = valores;
        this.distancias = distancias;
    }

    public void compararPrecos(Caminhao caminhao, Vagao vagao){
        double valorTotal = 0;
        int caminhoes = 0;
        int vagoes = 0;

        for(int iterator = 0; iterator < this.getPesos().size(); iterator++){
            caminhao.carga.setPeso(pesos.get(iterator));
            caminhao.carga.setValor(valores.get(iterator));

            vagao.carga.setPeso(pesos.get(iterator));
            vagao.carga.setValor(valores.get(iterator));

            if(caminhao.calculaFrete(distancias.get(iterator)) < vagao.calculaFrete(distancias.get(iterator))){
                caminhoes++;
                valorTotal += caminhao.calculaFrete(distancias.get(iterator));
            }else if(caminhao.calculaFrete(distancias.get(iterator)) > vagao.calculaFrete(distancias.get(iterator))){
                vagoes++;
                valorTotal+=vagao.calculaFrete(distancias.get(iterator));
            }else{
                caminhoes++;
                valorTotal += caminhao.calculaFrete(distancias.get(iterator));
            }



        }

        System.out.println("Serão necessarios "+caminhoes+" caminhões e "+vagoes+" vagões");
        System.out.printf("Valor total = %.2f\n",valorTotal);
    }


    //Getters and Setters
    public ArrayList<Integer> getPesos() {
        return pesos;
    }

    public void setPesos(ArrayList<Integer> pesos) {
        this.pesos = pesos;
    }

    public ArrayList<Integer> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Integer> valores) {
        this.valores = valores;
    }

    public ArrayList<Integer> getDistancias() {
        return distancias;
    }

    public void setDistancias(ArrayList<Integer> distancias) {
        this.distancias = distancias;
    }
}
