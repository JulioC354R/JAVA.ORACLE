package ProgramaFliperama;
import java.util.*;

public class ProgramaFliperama {
    public static void main(String[] args) throws Exception {
    Jogos Tomb_Raider = new Jogos();
    Tomb_Raider.setNomeJogo("Tomb Raider");
    Jogos.tickets = new Random();
    Cartoes c1 = new Cartoes();
    Cartoes c2 = new Cartoes();

    c1.setNumCartao(123456);
    c2.setNumCartao(102030);
    c1.setSaldoTickets(0);
    c2.setSaldoTickets(0);


    Scanner input =  new Scanner(System.in);
    int i=1; 
    while (i != 0){ 
        MenuInicial(input, c1, c2, i);
    }
        



        
    }

    public static void MenuInicial(Scanner input, Cartoes c1, Cartoes c2, int i){
        System.out.println("Bem vindo ao Fliperama, o que deseja fazer? \n1 - Entrar no Terminal \n2 - Entrar em Jogos \n0 - Sair");
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                 AcessarTerminal(input, c1, c2);
                    
                break;
            case 2:AcessarJogos(input, c1, c2);
                        
                break;
            
            default:
            System.out.println("Fechando o Programa...");
            i = 0;
                break;
            }
    }

    public static void AcessarTerminal(Scanner input, Cartoes c1, Cartoes c2) {
        System.out.println("O que deseja fazer?\n1 - Comprar Créditos\n2 - Verificar Saldo\n3 - Transferir Créditos \n4 - Resgatar Prêmios \n0 - Sair");
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Insira os valor de créditos que deseja comprar: ");
                Double dinheiroInserido = input.nextDouble();
                Terminais.ComprarCreditos(dinheiroInserido, c1);
                Terminais.VerificarSaldo(c1);
                break;
            case 2:
                Terminais.VerificarSaldo(c1);
                break;
            case 3:
                System.out.println("Insira o valor a Transferir: ");
                int valorATransferir = input.nextInt();
                Terminais.TransferirSaldos(c1, c2, valorATransferir);
                Terminais.VerificarSaldo(c1);
                Terminais.VerificarSaldo(c2);
                break;
            case 4 :
                System.out.println("Selecione o Prêmio: \n1 - 300 TICKETS - Boneco do Prof Montanha 'Obtenha uma imagem do Rei da Programação'");
                System.out.println("2 - 200 TICKETS - Tela Prof Jairo Postura Elegante 'Famosa imagem do Prof Jairo elegantemente no seu PC'");
                System.out.println("3 - 500 TICKETS - Livro do Prof Calado 13546 edição 'Livro edição limitada contendo todos os segredos da Programação");
                int escolha = input.nextInt();
                int ticketsNecessarios = 0;
                if (escolha == 1){
                    ticketsNecessarios = 300;
                } else if (escolha == 1){
                    ticketsNecessarios = 200;
                } else {
                    ticketsNecessarios = 500;
                }
                CategoriaPremios.PegarPremios(c1, ticketsNecessarios, escolha);
                break;
            
            default:
                break;
        }
    }

    public static void AcessarJogos(Scanner input, Cartoes c1, Cartoes c2){
        System.out.println("Qual o jogo deseja iniciar?\n1 - Tomb Raider (2 créditos) \n2 - God Of War (5 créditos)\n3 - LOL (1 crédito)\n0 - Sair");
        int escolha = input.nextInt(); 
        Double creditosNecessarios;
        if(escolha == 1){
            Jogos.setSaldoNecessario(2);
            creditosNecessarios =  Jogos.getSaldoNecessario();
            Jogos.Jogar(creditosNecessarios, c1);
        }else if (escolha ==2){

            Jogos.setSaldoNecessario(5);
            creditosNecessarios =  Jogos.getSaldoNecessario();
            Jogos.Jogar(creditosNecessarios, c1);
        }else if (escolha ==3){
            Jogos.setSaldoNecessario(1);
            creditosNecessarios =  Jogos.getSaldoNecessario();
            Jogos.Jogar(creditosNecessarios, c1);
           } else {
            System.out.println("Jogo não encontrado");
           }
    }

}
