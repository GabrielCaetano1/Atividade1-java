import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        System.out.print("Nome do item: ");
        String item = leitor.nextLine();
    
        System.out.print( "Quantidade atual em estoque: ");
        int estoque = leitor.nextInt();
    
        System.out.print("Quantidade de saida: ");
        int saida = leitor.nextInt();
    
        if (saida > estoque) {
            System.out.println("Saldo do estoque insuficiente para retirada: \n");
        } else if (saida == estoque) {
            System.out.println("Estoque zerado com sucesso: \n");
        } else {
            int resultado = estoque - saida;
            System.out.println(String.format("Venda de %s realizada. Estoque: %d", item, resultado));
        }
        leitor.close();
    }
}