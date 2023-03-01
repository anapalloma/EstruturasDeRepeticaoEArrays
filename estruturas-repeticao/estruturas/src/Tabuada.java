/*
 Desenvolva um gerador de tabuada,
 capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 O usuário deve informar de qual número ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo:

 Tabuada de 5:
 5 x 1 = 5
 5 x 2 = 10
 5 x 3 = 15
 ...
 5 x 10 = 50
 */
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int resultado;
        
        System.out.print("Informe de qual número deseja ver a tabuada: ");
        numero = scan.nextInt();

        do{
            System.out.print("Número inválido. Informe outro valor: ");
            numero = scan.nextInt();
        }while (numero < 0 | numero > 10);

        scan.close();

        System.out.println("Tabuada de " + numero + ":"); 

        for (int i = 1; i < 11; i++){
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
        
    }    
}
