import java.util.*;

public class TestClass {

    public void main(String args[]) {
        
        //Temp in celsius is 38.00000000000001
        //Hypotenuse is 10.816653826391969
        //The sum of the dice values is 9
        double celsius = 0;
        celsius = CelsiusConverter(celsius);
        int SomaDado = 0;
        SomaDado = roll(SomaDado);
        double Hipotenusa= 0;
        Hipotenusa = hypotenuse(Hipotenusa);
        Impressao(celsius, SomaDado, Hipotenusa);

    }
    private void Impressao(double celsius, int SomaDado, double Hipotenusa) {
        System.out.println("A Temperatura em Celsius é " + celsius);
        System.out.println("A Hipotenusa é " + Hipotenusa);
        System.out.println("A soma dos dados é " + SomaDado);
    }
    public double CelsiusConverter (Double celsius){
        double Fahrenheit; 
        System.out.println("Insira a temperatura em Fahrenheit:");
        Scanner teclado = new Scanner(System.in);
        Fahrenheit = teclado.nextInt();

        celsius = 5 * ((Fahrenheit-32) / 9);
        
        System.out.println(Fahrenheit + "F" + " é igual à " +  celsius + "C");
        teclado.close();
        return celsius;
    }


    public int roll(int SomaDado){
        Random Dado = new Random();
        int resultado1 = Dado.nextInt(6) +1 ;
        int resultado2 = Dado.nextInt(6) +1;
        SomaDado = resultado1 + resultado2;
        System.out.println("Dado 1: " + resultado1);
        System.out.println("Dado 2: " + resultado2);
        System.out.println("Resultado da Soma = " + SomaDado);
        return SomaDado;
    }
    public double hypotenuse (Double Hipotenusa){
        double A, B;
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
        return Hipotenusa;
    }


}
