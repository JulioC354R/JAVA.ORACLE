package ProgramaFliperama;

public class Terminais {
    private int dinheiroInserido;
    private int creditosAdicionados;
    
    public int getCreditos() {
        return creditosAdicionados;
    }

    public void setCreditos(int creditosAdicionados) {
        this.creditosAdicionados = creditosAdicionados;
    }

    public int getDinheiroInserido() {
        return dinheiroInserido;
    }

    public void setDinheiroInserido(int dinheiroInserido) {
        this.dinheiroInserido = dinheiroInserido;
    }

        
    public static void ComprarCreditos(Double dinheiroInserido, Cartoes cartao){


        if (dinheiroInserido > 0){

        Double creditosAdicionados = dinheiroInserido*2;
        cartao.setSaldoCredito(cartao.getSaldoCredito() + creditosAdicionados);
        } else{
            System.out.println("Quantidade inválida!");
        }
    }

    public static void VerificarSaldo(Cartoes cartao1) {
        int numCartao = cartao1.getNumCartao();
        double saldoCredito = cartao1.getSaldoCredito();
        System.out.println("Numero do Cartão: " + numCartao + "\nSaldo Disponível: $" + saldoCredito);
    }

    public static void TransferirSaldos(Cartoes c1, Cartoes c2, int valorATransferir) {
        System.out.println("Insira o valor que deseja transferir: ");
        if (valorATransferir > c1.getSaldoCredito()){
            System.out.println("Não foi possível realizar a transferência");
        } else{
            c1.setSaldoCredito(c1.getSaldoCredito() - valorATransferir);
            c2.setSaldoCredito(c2.getSaldoCredito() + valorATransferir);
        }

    }



}
