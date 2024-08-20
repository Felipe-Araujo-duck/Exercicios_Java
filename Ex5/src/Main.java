import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        final String nome[] = new String[5];
        final double preco[] = new double[5];

        for(int i=0; i<5;i++){
            System.out.println("Digite o nome do Produto:");
            nome[i] = sca.next();
            System.out.println("Digite o preço do Produto:");
            preco[i] = sca.nextDouble();
        }

        for(int i=0; i<5; i++){
            System.out.println("Produto: "+ nome[i]);
            System.out.println("Valor: "+ preco[i]);
        }

    }
}