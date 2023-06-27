import java.util.*;

public class Modificanome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira seu Primeiro nome: ");
        String FirstName = teclado.nextLine();
        System.out.println("Entre com seu segundo nome: ");
        String LastName = teclado.nextLine();
        char FirsChar = FirstName.charAt(0);
        System.out.println("Seu nome é " + LastName + ", " + FirsChar +  ".");
        teclado.close();
    }

}
