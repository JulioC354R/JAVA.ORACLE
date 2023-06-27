import java.util.Scanner;

public class RetangETriangul {
    public static void main(String[] args) {

        String LinhaHorizontal = "#";
        String LinhasdoMeio = "";

        int cont = 0;
        String EspacosMeio = "";

        System.out.println("Você deseja imprimir um triangulo ou um retangulo?");
        System.out.println("1 - Triângulo");
        System.out.println("2 - Retângulo");

        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
            //imprimindo triangulo
            System.out.println("Insira a medida do triângulo isósceles direito que deseja imprimir:");
            int YAltura = input.nextInt();
            if (YAltura == 1){
                System.out.println("#");
            } else{
            while (YAltura < 1){
                System.out.println("Insira um valor maior que 0:");
                YAltura = input.nextInt();
            }
            int QtdEspacos = YAltura - 2;
            int QtdLinhasDoMeio = YAltura - 2;
            ImprimirTriangulo(YAltura, LinhaHorizontal, LinhasdoMeio, QtdEspacos, QtdLinhasDoMeio, cont, EspacosMeio);
            }
                break;
            case 2:
            //imprimindo retangulo
            System.out.println("Insira largura do retangulo que deseja imprimir:");
            int XLargura = input.nextInt();
            while (XLargura < 1){
                System.out.println("Insira um valor maior que 0:");
                XLargura = input.nextInt();
            }

            System.out.println("Insira a altura do retangulo que deseja imprimir:");
            YAltura = input.nextInt();
            while (YAltura < 1){
                System.out.println("Insira um valor maior que 0:");
                YAltura = input.nextInt();
            }
            int QtdEspacos = YAltura - 2;
            int QtdLinhasDoMeio = YAltura - 2;
            ImprimirRetangulo(XLargura, YAltura, LinhaHorizontal, LinhasdoMeio, QtdEspacos, QtdLinhasDoMeio, cont, EspacosMeio);
                break;
        
            default:
            System.out.println("Você inseriu um valor inválido!");
                break;
        }



        input.close();
        
    }

    private static void ImprimirRetangulo(int XLargura, int YAltura, String LinhaHorizontal, String LinhasdoMeio,
            int QtdEspacos, int QtdLinhasDoMeio, int cont, String EspacosMeio) {
        for (int i = 1; i < XLargura; i++){
            LinhaHorizontal = LinhaHorizontal + "#";
        }
        if (YAltura != XLargura){
            QtdEspacos = XLargura - 2;
        }

        for (int i = 1; i < YAltura; i++){
            while(QtdEspacos > cont){
                EspacosMeio += " ";
                cont++;
            }
            LinhasdoMeio = "#" + EspacosMeio + "#";
        }
        System.out.println(LinhaHorizontal);
        for (int i = 1; QtdLinhasDoMeio >= i; i++){
            System.out.println(LinhasdoMeio);
        }
        if (YAltura >= 2){
            System.out.println(LinhaHorizontal);
            System.out.println();
        }
    }

        private static void ImprimirTriangulo(int YAltura, String LinhaHorizontal, String LinhasdoMeio,
            int QtdEspacos, int QtdLinhasDoMeio, int cont, String EspacosMeio) {
            LinhaHorizontal = "#";
            System.out.println(LinhaHorizontal);
            EspacosMeio = "";
            int XLargura = YAltura;
            for (int i = 2; YAltura > i ; i++){

                    LinhasdoMeio = "#" + EspacosMeio + "#";
                    System.out.println(LinhasdoMeio);
                    if(QtdEspacos > 0){
                        EspacosMeio = EspacosMeio + " ";
                    }
                }   

                for (int i = 1; QtdLinhasDoMeio >= i; i++){

                }
                String LinhaFinal = "#";
                for (int i = 1; i < XLargura; i++){
                    LinhaFinal += "#";
                }
                System.out.println(LinhaFinal);

            


    }
}
