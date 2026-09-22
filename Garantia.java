import java.util.Scanner;

public class Garantia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        System.out.print("Digite o codigo do produto: ");
        String codigo = leitor.nextLine();
        
        int garantia = 0;
        switch(codigo) {
            case "1" -> {// Eletrônicos
                garantia = 24;
                System.out.println("Garantia: 24 meses");
            }
            case "2" -> { // Vestuário
                garantia = 3;
                System.out.println("Garantia: 3 meses");
            }
            default -> System.out.println("Categoria inválida.");
        }
        leitor.close();
    
    }
}
