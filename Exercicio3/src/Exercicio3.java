import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> pesos = new ArrayList<>();
        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> distancias = new ArrayList<>();

        pesos.add(18550);
        pesos.add(8100);
        pesos.add(25700);
        pesos.add(9541);
        pesos.add(25740);
        pesos.add(5000);
        pesos.add(8900);

        valores.add(27500);
        valores.add(35410);
        valores.add(3650);
        valores.add(5799);
        valores.add(45000);
        valores.add(90570);
        valores.add(41000);

        distancias.add(200);
        distancias.add(554);
        distancias.add(112);
        distancias.add(1580);
        distancias.add(321);
        distancias.add(627);
        distancias.add(876);


        SimulacaoCustoFrete simulador = new SimulacaoCustoFrete(pesos, valores, distancias);

        simulador.compararPrecos();
    }
}
