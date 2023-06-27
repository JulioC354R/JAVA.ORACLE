package ProgramaFliperama;

public class CategoriaPremios {
    private String nome;
    private int quantidadeRestante;
    private int ticketsNecessarios;
    private static int boneco = 10, tela = 1, livro = 100;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTicketsNecessarios() {
        return ticketsNecessarios;
    }
    public void setTicketsNecessarios(int ticketsNecessarios) {
        this.ticketsNecessarios = ticketsNecessarios;
    }

    public int getQuantidadeRestante() {
        return quantidadeRestante;
    }
    public void setQuantidadeRestante(int quantidadeRestante) {
        this.quantidadeRestante = quantidadeRestante;
    }
        public static void PegarPremios(Cartoes c1, int ticketsNecessarios, int escolha) {

        if (escolha == 1) {
                if (c1.getSaldoTickets() > ticketsNecessarios && boneco > 0){
                c1.setSaldoTickets((c1.getSaldoTickets() - ticketsNecessarios));
                System.out.println("Você obteve uma figure do nosso amado mestre, a guarde com carinho.");
                boneco -= 1;
                System.out.println("Bonecos restantes: " + boneco);
                } else {
                    System.out.println("Erro, Produto indisponível ou Tickets insuficientes");
                }
        }else if (escolha == 2) {
                if (c1.getSaldoTickets() > ticketsNecessarios && tela > 0){
                c1.setSaldoTickets((c1.getSaldoTickets() - ticketsNecessarios));
                System.out.println("Você obteve uma tela do Prof Jairo Postura elegante, Fiño Senõres");
                tela -=1;
                System.out.println("Telas restantes: " + tela);
                } else {
                    System.out.println("Erro, Produto indisponível ou Tickets insuficientes");
                }
        } else if (escolha == 3) {
                if (c1.getSaldoTickets() > ticketsNecessarios && livro > 0){
                c1.setSaldoTickets((c1.getSaldoTickets() - ticketsNecessarios));
                System.out.println("Você obeteve o livro de magia proibida, uma vez lido ele será automaticamente destruído para a segurança da Humanidade.");
                livro -=1;
                System.out.println("Livros restantes : " + livro);
                } else {
                    System.out.println("Erro, Produto indisponível ou Tickets insuficientes");
                }
            }else {
            System.out.println("Erro, tente novamente");
               
        }

        
    }

}
