import java.util.Scanner;
public class Multiplos {
    public static void main(String[] args) {
        System.out.println("Insira um número do qual deseja saber seus múltiplos:");
        Scanner input = new Scanner(System.in);
        int NumeroInserido = input.nextInt();
        int Multiplos = 1;
        input.close();
        for (int i = 1; i < 13; i++){
            Multiplos = NumeroInserido * i;
            System.out.printf("%dX%d =  %d \n" , NumeroInserido, i, Multiplos);
        }
    }
}
