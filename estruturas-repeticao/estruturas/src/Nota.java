import java.util.Scanner;

/*
 Faça um programa que peça uma nota entre 0 e 10.
 Mostre uma mensagem caso o valor sejá inválido.
 Continue pedindo até que o usuário informe um valor válido.
 */
public class Nota {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Informe uma nota entre 0 e 10");
            nota = scan.nextInt();

            if (nota < 0 | nota > 10){
                System.out.println("Valor inválido! Digite novamente:");
            }
            else
                break;
        }

        scan.close();
        
    }
}
