import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos a cadastrar: ");
        int quantidade = leitor.nextInt();
        int total = 0;

        for (int i = 0; quantidade > i; quantidade-- ) {
            System.out.println("Digite o preço dos produtos: ");
            int preco = leitor.nextInt();
            total = preco + total;
        }
        System.out.println("A soma dos produtos é:" + total);
        leitor.close();
    }
}
