package JFo_Pratica8;

import java.util.ArrayList;

public class LigaFutebol {
    private String nome;
    private int pontuacao;
    private int golsMarcados;

    public void DadosPArtida(String nome, int pontuacao, int golsMarcados) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.golsMarcados = golsMarcados;
    }


ArrayList<LigaFutebol> DadosPartidas = new ArrayList<>();
}