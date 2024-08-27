import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner aux = new Scanner(System.in);
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<Funcionario>();
        Gestor g;
        Vendedor v;
        int op;
        do {
            System.out.println("\n1.Cadastrar Gestor");
            System.out.println("2.Cadastrar Vendedor");
            System.out.println("3.Mostrar Dados de Gestor e Vendedor");
            System.out.println("4.Mostrar Salários de um determinado Funcionário");
            System.out.println("5.Sair");
            System.out.print("Digite sua opção: ");
            op = aux.nextInt();
            switch (op) {
                case 1:
                    g = new Gestor();
                    cadastro(g);
                    System.out.println("Digite seu Cargo:");
                    g.setCargo(aux.next());
                    lista.add(g);
                    break;
                case 2:
                    v = new Vendedor();
                    cadastro(v);
                    System.out.println("Digite seu total de vendas:");
                    v.setVendas(aux.nextDouble());
                    lista.add(v);
                    break;
                case 3:
                    lista.forEach(item->{
                        System.out.println(item.mostra());
                    });
                    break;
                case 4:
                    System.out.print("Nome: ");
                    String pesquisa = aux.next();
                    for (Funcionario item : lista) {
                        if (item.getNome().equals(pesquisa)) {
                            System.out.println(item.mostra());

                            System.out.println("Salário: " + item.getSalario());

                        }
                    }
                    break;

            }
        } while (op != 5);
    }
    static void cadastro(Funcionario f) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        f.setNome(sca.next());
        System.out.println("Digite sue Salario: ");
        f.setSalario(sca.nextInt());
    }
}