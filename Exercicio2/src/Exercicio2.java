import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.print("Digite o peso da carga: ");
        double peso = keyboardScanner.nextDouble();

        System.out.print("Digite o valor da carga: ");
        double valor = keyboardScanner.nextDouble();

        System.out.print("Digite a distancia: ");
        int distancia = keyboardScanner.nextInt();

        Carga carga = new Carga(peso,valor);

        Caminhao caminhao = new Caminhao(carga);
        Vagao vagao = new Vagao(carga);


        System.out.printf("Frete Vagão = %.2f\n",vagao.calculaFrete(distancia));
        System.out.printf("Frete Caminhão = %.2f\n",caminhao.calculaFrete(distancia));

    }
}


        //Exemplos

//        Carga carga1 = new Carga(20000,30000);
//        Carga carga2 = new Carga(10000, 20000);
//
//        int distancia1 = 210;
//        int distancia2 = 125;


        /*Exemplo 1
        Caminhao caminhao1 = new Caminhao(carga1);
        Vagao vagao1 = new Vagao(carga1);

        System.out.printf("Frete Vagão = %.2f\n",vagao1.calculaFrete(distancia1));
        System.out.printf("Frete Caminhão = %.2f\n",caminhao1.calculaFrete(distancia1));
        */

        /*Exemplo 2
        Caminhao caminhao2 = new Caminhao(carga2);
        Vagao vagao2 = new Vagao(carga2);

        System.out.printf("Frete Vagão = %.2f\n",vagao2.calculaFrete(distancia2));
        System.out.printf("Frete Caminhão = %.2f\n",caminhao2.calculaFrete(distancia2));

         */

