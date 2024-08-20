import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("Digite um numero interio:");
        String num = sca.next();
        if(num.length() >= 5)
        {
            System.out.print("Este número tem 5 dígitos ou mais");
            return;
        }
        System.out.print("Esse numero tem "+ num.length() + " digitos");
    }
}