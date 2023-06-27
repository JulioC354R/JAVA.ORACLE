import java.util.Scanner;

public class CalcularHipotenusa {
    public static void main(String[] args) throws Exception {
        int A;
        int B;
        int C;
        System.out.println("Insira o valor do cateto do triângulo retângulo:");

        Scanner teclado = new Scanner(System.in);  
        A = teclado.nextInt();
        System.out.println("Insira o valor do segundo cateto do triângulo retângulo:");
        B = teclado.nextInt();

        C = (A * A) + (B * B) ;
        C = (int) Math.sqrt(C);


        System.out.println("O valor da Hipotenusa é igual à " +  C);

        teclado.close();
    }
}