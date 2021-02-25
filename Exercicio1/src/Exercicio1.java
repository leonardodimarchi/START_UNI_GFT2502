import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.print("Multiplicando: ");
        int multiplicando = keyboardScanner.nextInt();

        System.out.print("Início do intervalo: ");
        int inicioIntervalo = keyboardScanner.nextInt();

        System.out.print("Fim do intervalo: ");
        int fimIntervalo = keyboardScanner.nextInt();


        if(multiplicando < 0 || multiplicando > 3000){
            System.out.println("Multiplicando inválido ( 0 < x < 3000)");
        }else if(fimIntervalo < 0 || fimIntervalo > 3000){
            System.out.println("Intervalo final inválido ( 0 < x < 3000");
        }else if(inicioIntervalo < 0 || inicioIntervalo > 3000){
            System.out.println("Intervalo inicial inválido ( 0 < x < 3000");
        }else if (fimIntervalo - inicioIntervalo > 10){
            System.out.println("Intevalo inválido (diferença maior que 10)");
        }else if(fimIntervalo < inicioIntervalo){
            System.out.println("Intervalo inválido (final é menor que inicial)");
        }else{
            for(int iterator=inicioIntervalo; iterator <= fimIntervalo; iterator++){
                System.out.println(multiplicando+" x "+iterator+" = "+(multiplicando*iterator));
            }
        }




    }
}
