import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] somasLinhas = new int[3];


        System.out.println("Digite os valores para uma matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
            somasLinhas[i] = soma;
        }

        System.out.println("Somas das linhas:");
        for (int i = 0; i < somasLinhas.length; i++) {
            System.out.println("Soma da linha " + i + ": " + somasLinhas[i]);
        }
    }
}