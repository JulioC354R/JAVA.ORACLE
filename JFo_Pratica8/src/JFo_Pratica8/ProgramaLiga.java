package JFo_Pratica8;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ProgramaLiga{
    public static void main(String[] args) {
        equipe e1 = new equipe();  equipe e2 = new equipe();  equipe e3 = new equipe();  equipe e4 = new equipe();
        int a[] = new int[5];
        for (int b = 0; b < a.length; b++) {
            a[b] = 0;
        }
        e1.setPlacar(a);
        e2.setPlacar(a);
        e3.setPlacar(a);
        e4.setPlacar(a);

        Jogo J = new Jogo(0, 0, 0, 0, "", "");
        int i = 0;
        String time1 = JOptionPane.showInputDialog("Insira o nome Primeiro time:");
        e1.setNome(time1);
        String time2 = JOptionPane.showInputDialog("Insira o nome Segundo time:");
        e2.setNome(time2);
        String time3 = JOptionPane.showInputDialog("Insira o nome Terceiro time:");
        e3.setNome(time3);
        String time4 = JOptionPane.showInputDialog("Insira o nome Quarto time:");
        e4.setNome(time4);

        ArrayList<Jogo> DadosPartidas = new ArrayList<>();

        Random random = new Random();
        for (int frio = 0; frio <= 3; i++){
        String input = JOptionPane.showInputDialog("Insira a Temperatura: (temperatura menores que 10 serão consideradas baixas)");
        int temp = Integer.parseInt(input);
        if (temp < 10){
            frio +=1 ;

        }

        int selecionarTimesAleatorios = random.nextInt(4) + 1;

        switch (selecionarTimesAleatorios) {
            case 1:
                J.IniciarPartida(e1, e2);
                DadosPartidas.add(new Jogo ( i, temp, J.getGolsDaPartidaTimeA(), J.getGolsDaPartidaTimeB(), J.getNomeEquipeA(), J.getNomeEquipeB() ));
                break;
            case 2:
                J.IniciarPartida(e2, e3);
                DadosPartidas.add(new Jogo ( i, temp, J.getGolsDaPartidaTimeA(), J.getGolsDaPartidaTimeB(), J.getNomeEquipeA(), J.getNomeEquipeB() ));
                break;
            case 3:
                J.IniciarPartida(e3, e4);
                DadosPartidas.add(new Jogo ( i, temp, J.getGolsDaPartidaTimeA(), J.getGolsDaPartidaTimeB(), J.getNomeEquipeA(), J.getNomeEquipeB() ));
                break;
            case 4:
                J.IniciarPartida(e4, e1);
                DadosPartidas.add(new Jogo ( i, temp, J.getGolsDaPartidaTimeA(), J.getGolsDaPartidaTimeB(), J.getNomeEquipeA(), J.getNomeEquipeB() ));
                break;        
            default:
                break;
        }


        }


        System.out.println("O Inverno Chegou \n------------------RESULTADOS------------------");
        e1.ImprimirResultadoEquipe(e1.getPlacar());
        e2.ImprimirResultadoEquipe(e2.getPlacar());
        e3.ImprimirResultadoEquipe(e3.getPlacar());
        e4.ImprimirResultadoEquipe(e4.getPlacar());
        int i2 = 0;

        while (DadosPartidas.size() >= i2){
            Jogo P = DadosPartidas.get(i2);
            System.out.println("Partida #" + P.getIDpartida());
            System.out.println("Temperatura: " + P.getTemperatura());
            System.out.println(P.getNomeEquipeA() + " [" + P.getGolsDaPartidaTimeA() + "] X [" + P.getGolsDaPartidaTimeB() + "] " + P.getNomeEquipeB());




            i2++;
        }
    }
}