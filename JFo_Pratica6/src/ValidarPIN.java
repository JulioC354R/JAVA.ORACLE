import java.util.Scanner;

public class ValidarPIN {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor crie um PIN:");
        Scanner input = new Scanner(System.in);
        int PIN = input.nextInt();

        System.out.println("Insira seu PIN para acessar o sistema:");
        int PINinserido = input.nextInt();

        while (PINinserido != PIN){
            System.out.println("ERRO, por favor tente novamente:");
            PINinserido = input.nextInt();
        }
        input.close();
        System.out.println("Você inseriu um PIN válido, seu acesso foi liberado!");
    }
}




/*1. Declare um PIN inteiro válido.
2. Solicite que o usuário insira o PIN.
3. Em um loop while, execute as seguintes etapas:
o	Compare o PIN inserido pelo usuário com o PIN já declarado. 
o	Se o PIN inserido não for o mesmo, solicite que o usuário insira o PIN novamente.
o	Repita o loop até que o PIN correto seja inserido.
4. Imprima uma mensagem confirmando que o PIN correto foi inserido e que agora o usuário tem 
acesso à conta.
 */