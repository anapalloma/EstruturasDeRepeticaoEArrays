/*
 Faça um programa que peça N números inteiros,
 calcule e mostre a quantidade de números pares
 e a quantidade de números ímpares.
 */

import java.util.Scanner;
public class Par_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador;
        int numero;
        int par = 0;
        int impar = 0;
        int i = 0;
        
        System.out.println("Quantidade de números: ");
        contador = scan.nextInt();

        do{
            System.out.println("Informe um valor:");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
            i++;
        } while(i < contador);
        
        scan.close();
        
        System.out.println("A quantidade de números pares é " + par);
        System.out.println("A quantidade de números ímpares é " + impar);
      
    }
}
