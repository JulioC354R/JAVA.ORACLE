import java.util.Scanner;

public class CelsiusConverter {
    public static void main(String[] args) throws Exception {
        int Fahrenheit;
        int celsius;

        System.out.println("Insira a temperatura em Fahrenheit:");

        Scanner teclado = new Scanner(System.in);
        Fahrenheit = teclado.nextInt();
    
        celsius = 5 * ((Fahrenheit-32) / 9);


        System.out.println(Fahrenheit + "F" + " é igual à " +  celsius + "C");

        teclado.close();
    }
}