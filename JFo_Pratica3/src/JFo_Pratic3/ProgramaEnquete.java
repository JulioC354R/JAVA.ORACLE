package JFo_Pratic3;

import java.util.Scanner;

/*
•	Aceitar pelo menos uma entrada, que deverá ser analisada como String
•	Aceitar pelo menos uma entrada, que deverá ser analisada como int
•	Aceitar pelo menos uma entrada, que deverá ser analisada como double
•	Usar pelo menos uma entrada em uma pergunta para o usuário
•	Fazer cálculos com pelo menos uma entrada int
•	Fazer cálculos com pelo menos uma entrada double
•	Aceitar pelo menos um total de dez entradas 
 */

 public class ProgramaEnquete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        PessoasEntrevistada  Pessoa[] = new PessoasEntrevistada[99];
        int i = 0;
        int totalVotos = 0;
        int QtdUsamPC = 0;
        ContagemDeVotos voto = new ContagemDeVotos();
        int votoWind = 0, votoUnix = 0, votoLinux = 0, votoNetware = 0, votoMac = 0, votoOutro = 0;
        String nome;
        Nome nomePessoa = new Nome();
        do {
                Pessoa[i] = new PessoasEntrevistada();
                System.out.println("Entrevistado: " + i);
                System.out.println("Insira seu nome:");
                nome = input.nextLine();
                if(i!=0){
                    nome = input.nextLine();
                }
                nomePessoa.listanome.add(nome);
                



            System.out.println("Insira sua idade:");
            int idade = Integer.parseInt(input.nextLine());
            while ( idade < 0  && idade > 120){
                System.out.println("Digitou errado, tente novamente");
                idade = Integer.parseInt(input.nextLine());
            }
            Pessoa[i].setIdade(idade);


            System.out.println("Insira sua profissão:");
            String profissao = input.nextLine();
            Pessoa[i].setProfissao(profissao);

            System.out.println("Você usa computador? (digite 's' para sim e 'n' para não)");
            char seUsaPC = input.next().charAt(0);
            while ( seUsaPC != 's' && seUsaPC != 'n'){
                System.out.println("Digitou errado, tente novamente");
                seUsaPC = input.next().charAt(0);
            }
        

  
            if (seUsaPC == 's'){
                Pessoa[i].setUsaPC("SIM");
                QtdUsamPC = voto.getQtdUsamPC();
                QtdUsamPC = QtdUsamPC + 1;

                System.out.println("\"Qual Sistema Operacional você usa?\"");
                System.out.println("1- Windows Server");
                System.out.println("2- Unix");
                System.out.println("3- Linux");
                System.out.println("4- Netware");
                System.out.println("5- Mac OS");
                System.out.println("6- Outro");
            
                int selecionarVoto =  input.nextInt();
    
                totalVotos++;
    
    
    
                switch (selecionarVoto) {
                    case 1:
                        votoWind++;
                        Pessoa[i].setSO_Usado("Windows");
                        voto.setvotoWind(selecionarVoto);
                        break;
                    case 2:
                        votoUnix++;
                        Pessoa[i].setSO_Usado("Unix");
                        voto.setvotoUnix(selecionarVoto);
                        break;
                    case 3:
                        votoLinux++;
                        Pessoa[i].setSO_Usado("Linux");
                        voto.setvotoLinux(selecionarVoto);
                        break;
                    case 4:
                        votoNetware++;
                        Pessoa[i].setSO_Usado("Netware");
                        voto.setvotoNetware(selecionarVoto);
                        break;
                    case 5:
                        votoMac++;
                        Pessoa[i].setSO_Usado("Mac OS");
                        voto.setvotoMac(selecionarVoto);
                        break;
                    case 6:
                    votoOutro++;
                    Pessoa[i].setSO_Usado("Outro");
                    voto.setVotoOutro(selecionarVoto);
    
                        break;
                    default:
                    System.out.println("voto anulado");
                    Pessoa[i].setSO_Usado("");
                        break;
                }   

            }else {
                Pessoa[i].setUsaPC("NÃO");
                }
            voto.setQtdUsamPC(QtdUsamPC);


       
        

        System.out.println("Deseja encerrar a votação? Digite 's'para SIM ou 'n' para NÃO");
        char encerrar = input.next().charAt(0);

        if (encerrar == 's'){
            i = i + 100;
        } else {
            System.out.println("Próximo Voto: ");
        }

        i++;
         
        } while(i < 100); 
        i = i - 100;


        Double percentVotoWind = (double) votoWind /  totalVotos * 100;
        Double percentVotoUnix = (double) votoUnix /totalVotos * 100;
        Double percentVotoLinux = (double)votoLinux  / totalVotos * 100;
        Double percentVotoNetware = (double)votoNetware / totalVotos* 100;
        Double percentVotoMac = (double)votoMac / totalVotos * 100;
        Double percentVotoOutro = (double)votoOutro /totalVotos * 100;


        System.out.println("Qtd Pessoas Entrevistadas = " + i);
        System.out.println("Qtd Pessoas que usam PC = " + voto.getQtdUsamPC());
        System.out.println("Sistema Operacional     Votos   %");
        System.out.println("-------------------     -----   ---");
        System.out.println("Windows                  " + votoWind + "   "+ percentVotoWind+ "%");
        System.out.println("Unix                     " + votoUnix + "   "+ percentVotoUnix+ "%");
        System.out.println("Linux                    " + votoLinux + "   "+ percentVotoLinux+ "%");
        System.out.println("Netware                  " + votoNetware + "   "+ percentVotoNetware+ "%");
        System.out.println("Mac OS                   " + votoMac + "   "+ percentVotoMac+ "%");
        System.out.println("Outro                    " + votoOutro + "   "+ percentVotoOutro+ "%");
        System.out.println("-------------------     -----   ---");
        System.out.println("Total                    " + totalVotos);
        System.out.println();
        System.out.println("O vencedor foi");

        System.out.println("Deseja ver a lista dos votos? Digite 's'para SIM ou 'n' para NÃO");
        char verLista = input.next().charAt(0);

        if (verLista == 's'){
            for(int cont = 0; cont < i; cont++ ){
                System.out.println("Entrevista " + cont);
                System.out.println("Nome:           " + nomePessoa.listanome.get(cont));
                System.out.println("Idade:          " + Pessoa[cont].getIdade());
                System.out.println("Profissão:      " + Pessoa[cont].getProfissao());
                System.out.println("Usa Computador?:" + Pessoa[cont].getUsaPC());
                System.out.println("SO utilizado:   " + Pessoa[cont].getSO_Usado());
                System.out.println("-------------------------------------------");
                System.out.println("Programa encerrado...");

            }

        } else {
            input.close();
            System.out.println("Programa encerrado...");
        }

    }
        
}
 
 


