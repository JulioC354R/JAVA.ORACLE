package JFo_Pratica8;

import java.util.Random;
public class Jogo{

    private int IDpartida = 1;
    private int temperatura;
    private int golsDaPartidaTimeA;
    private int golsDaPartidaTimeB;
    private String NomeEquipeA;
    private String NomeEquipeB;

    public Jogo(int ID, int temp, int golsDaPartidaTimeA2, int golsDaPartidaTimeB2, String nomeEquipeA2,
            String nomeEquipeB2) {
    }

    public int getGolsDaPartidaTimeA() {
        return golsDaPartidaTimeA;
    }

    public void setGolsDaPartidaTimeA(int golsDaPartidaTimeA) {
        this.golsDaPartidaTimeA = golsDaPartidaTimeA;
    }

    public int getGolsDaPartidaTimeB() {
        return golsDaPartidaTimeB;
    }

    public void setGolsDaPartidaTimeB(int golsDaPartidaTimeB) {
        this.golsDaPartidaTimeB = golsDaPartidaTimeB;
    }

    public String getNomeEquipeA() {
        return NomeEquipeA;
    }

    public void setNomeEquipeA(String nomeEquipeA) {
        NomeEquipeA = nomeEquipeA;
    }

    public String getNomeEquipeB() {
        return NomeEquipeB;
    }

    public void setNomeEquipeB(String nomeEquipeB) {
        NomeEquipeB = nomeEquipeB;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIDpartida() {
        return IDpartida;
    }

    public void setIDpartida(int iDpartida) {
        IDpartida = iDpartida;
    }



    public void IniciarPartida(equipe a,
     equipe b) {

        
        int [] placarA = a.getPlacar();
        golsDaPartidaTimeA = gerarGolsAleatorio();
        golsDaPartidaTimeB = gerarGolsAleatorio();
        placarA[3] = golsDaPartidaTimeA; //colocando o saldo dos gols dentro do array
        placarA[4] = golsDaPartidaTimeB;
        a.setPlacar(placarA);

        int [] placarB = b.getPlacar();
        placarB[3] = golsDaPartidaTimeB;
        placarB[4] = golsDaPartidaTimeA;
        b.setPlacar(placarB);

        
        
    }
        public int gerarGolsAleatorio() {
        Random random = new Random();
        return random.nextInt(10);
    }
}