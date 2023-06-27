package ProgramaFliperama;
import java.util.Random;



public class Jogos {
    private static double SaldoNecessario;
    private int saldoTickets;
    public static Random tickets;
    private String NomeJogo;
    
    
    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }

    public String getNomeJogo() {
        return NomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        NomeJogo = nomeJogo;
    }

    public static double getSaldoNecessario() {
        return SaldoNecessario;
    }

    public static void setSaldoNecessario(double saldoNecessario) {
        SaldoNecessario = saldoNecessario;
    }


    public static void Jogar(Double SaldoNecessario, Cartoes c1) {

        if (c1.getSaldoCredito() > SaldoNecessario){
            c1.setSaldoCredito((c1.getSaldoCredito() - SaldoNecessario));;
            tickets = new Random();
            int ticketsGanhos = tickets.nextInt(200) + 1;
            c1.setSaldoTickets((c1.getSaldoTickets() + ticketsGanhos));
            System.out.println("Jogando...\n");

            int numeroCartao = c1.getNumCartao();
            System.out.println("Numero do Cartão: " + numeroCartao + "\nTickets Ganhos: "+ ticketsGanhos + "\n Tickets disponíveis: " + c1.getSaldoTickets());

        } else {
            System.out.println("Saldo de créditos Insuficiente!!!!!");
        }
    }

}
