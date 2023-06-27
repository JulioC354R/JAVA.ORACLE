import java.util.*;

public class ComputeMethods {
    
    public int celsius (int Fahrenheit){
        
        int celsius;

        System.out.println("Insira a temperatura em Fahrenheit:");

        Scanner teclado = new Scanner(System.in);
        Fahrenheit = teclado.nextInt();
    
        celsius = 5 * ((Fahrenheit-32) / 9);


        System.out.println(Fahrenheit + "F" + " é igual à " +  celsius + "C");

        teclado.close();
        return celsius;
    }
public double hypotenuse (int A, int B){

    double hypotenuse;
    System.out.println("Insira o valor do cateto do triângulo retângulo:");

    Scanner teclado = new Scanner(System.in);  
    A = teclado.nextInt();
    System.out.println("Insira o valor do segundo cateto do triângulo retângulo:");
    B = teclado.nextInt();

    hypotenuse = (A * A) + (B * B) ;
    hypotenuse = Math.sqrt(hypotenuse);


    System.out.println("O valor da Hipotenusa é igual à " +  hypotenuse);

    teclado.close();
    return hypotenuse;
}
public int roll(){
    Random Dado = new Random();
    int resultado1 = Dado.nextInt(6) +1 ;
    int resultado2 = Dado.nextInt(6) +1;
    int roll = resultado1 + resultado2;
    System.out.println("Dado 1: " + resultado1);
    System.out.println("Dado 2: " + resultado2);
    System.out.println("Resultado da Soma = " + roll);
    return roll;
}

}

