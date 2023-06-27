import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        int corSemaforo;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a cor do semáforo.");
        System.out.println("1 - Vermelha. \n2 - Verde. \n3 - Amarela.");

        corSemaforo = input.nextInt();

        if (corSemaforo == 1){
            System.out.println("A próxima luz será VERDE.");
        } else if (corSemaforo ==2){
            System.out.println("A próxima luz será AMARELA.");
        } else if (corSemaforo == 3){
            System.out.println("A próxima luz será VERMELHA.");
        } else{
            System.out.println("Cor inválida.");
        } input.close();


    }
}
