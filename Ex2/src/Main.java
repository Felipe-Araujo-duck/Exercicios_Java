import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sca.next();
        System.out.println(String.join(" ", palavra.split("")));
    }
}