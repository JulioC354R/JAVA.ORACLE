import java.util.Scanner;

public class TrafficLightSwitch {
    
    public static void main(String[] args) {
        int corSemaforo;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a cor do semáforo.");
        System.out.println("1 - Vermelha. \n2 - Verde. \n3 - Amarela.");

        corSemaforo = input.nextInt();

        switch (corSemaforo) {
            case 1:
            System.out.println("A próxima luz será VERDE.");
                break;

            case 2:
            System.out.println("A próxima luz será AMARELA.");
                break;

            case 3:
            System.out.println("A próxima luz será VERMELHA.");
                break;

            default:
            System.out.println("Cor inválida.");
                break;
        }
        input.close();
    }
}
