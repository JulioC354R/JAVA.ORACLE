import java.util.Random;

public class SomaDado {
    public static void main(String[] args) {
        Random Dado = new Random();
        int resultado1 = Dado.nextInt(6) +1 ;
        int resultado2 = Dado.nextInt(6) +1;
        int soma = resultado1 + resultado2;
        System.out.println("Dado 1: " + resultado1);
        System.out.println("Dado 2: " + resultado2);
        System.out.println("Resultado da Soma = " + soma);
    }
}
