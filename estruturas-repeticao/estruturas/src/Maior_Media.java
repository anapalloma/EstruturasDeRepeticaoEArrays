import java.util.Scanner;

/*
Faça um programa que leia 5 números.
Informe o maior número
e a média desses números.
*/
public class Maior_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        double media;

        for(int contador=1; contador<6; contador++){
            System.out.print("Informe um número:");
            numero = scan.nextInt();
            soma += numero;
            if (numero > maior){
                maior = numero;
            }
        }

        scan.close();
        
        media = (soma/5);

        System.out.println("A média é: " + media);

        System.out.println("O maior número é: " + maior);
    }
}
