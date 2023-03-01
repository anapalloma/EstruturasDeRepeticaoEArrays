import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int produto;
        int fatorial;

        System.out.print("Informe um número inteiro: ");
        numero = scan.nextInt();
        scan.close();
        fatorial = numero;
        

        for (int i = fatorial - 1; i >= 1; i--){
            produto = (fatorial * i);
            fatorial = produto;
        }

        System.out.println(fatorial);

    }
}
