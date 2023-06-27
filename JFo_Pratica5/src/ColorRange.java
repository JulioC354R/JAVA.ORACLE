import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira o comprimento da onda:");
        Scanner input = new Scanner(System.in);
        int comprimentoOnda = input.nextInt();
        String CorCorrespondente = "";
        if (comprimentoOnda >= 380 && comprimentoOnda < 450){
            CorCorrespondente = "VIOLETA";
        }else if (comprimentoOnda >= 450 && comprimentoOnda < 495){
            CorCorrespondente = "AZUL";
        }else if (comprimentoOnda >= 495 && comprimentoOnda < 570){
            CorCorrespondente = "VERDE";
        }else if (comprimentoOnda >= 570 && comprimentoOnda < 590){
            CorCorrespondente = "AMARELO";
        }else if (comprimentoOnda >= 590 && comprimentoOnda < 620){
            CorCorrespondente = "LARANJA";
        }else if (comprimentoOnda >= 620 && comprimentoOnda < 750){
            CorCorrespondente = "VERMELHO";
        } else{
            System.out.println("O comprimento de onde inserido não faz parte do espectro visível.");
        }
        
        if (comprimentoOnda>=380 && comprimentoOnda <750){
            System.out.println("O comprimento de onda escolhido corresponde a cor " + CorCorrespondente);
        }
        input.close();




    }
}
