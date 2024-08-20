import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vetorNum = new int[5];
        String[] vetorPalavra = new String[5];
        Scanner sca = new Scanner(System.in);
        for(int i =0; i < 5; i++){
            System.out.print("Digite um numero para a "+ (i+1) + "posição:");
            vetorNum[i] = sca.nextInt();
        }

        for(int i =0; i<5; i++){
            System.out.print("Digite uma palavra para a "+ (i+1) + "posição:");
            vetorPalavra[i] = sca.next();
        }
        Arrays.sort(vetorNum);
        Arrays.sort(vetorPalavra);
        System.out.print(Arrays.toString(vetorNum));
        System.out.print(Arrays.toString(vetorPalavra));

    }
}