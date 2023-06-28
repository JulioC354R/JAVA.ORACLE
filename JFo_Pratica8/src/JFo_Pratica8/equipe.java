package JFo_Pratica8;

public class equipe {
    private String nome;
    private int placar [] = new int[4];
    //0 = vitorias, 1 = derrotas, 2 = empates, 3 = golsMarcados, 4 = golsSofridos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getPlacar() {
        return placar;
    }

    public void setPlacar(int[] placar) {
        this.placar = placar;
    }

    public void ImprimirResultadoEquipe(int[] placar){
        System.out.println("*********RESULTADO*********\n TIME:" + nome +"\nVITÓRIAS = " + placar[0] + ", DERROTAS = " + placar[1] + ", EMPATES = " + placar[2] +
         "\nGOLS MARCADOS = " + placar[3] + ", GOLS SOFRIDOS = " + placar[4]) ;
    }
}

