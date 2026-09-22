import java.util.Scanner;

public class LaboratorioIntroducao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n--- SISTEMA DE GESTÃO TECH ---");
            System.out.println("1. Validar Estoque");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            
            /* 
             * PRO-TIP DIDÁTICO: Limpeza de Buffer
             * O método nextInt() lê apenas os dígitos, mas o caractere 'Enter' (\n) 
             * continua no buffer. Se não usarmos o nextLine() abaixo, o próximo 
             * input de texto seria "atropelado" pelo Enter residual.
             */
            leitor.nextLine(); 

            if (opcao == 1) {
                System.out.print("Quantidade atual em estoque: ");
                int estoque = leitor.nextInt();
                System.out.print("Quantidade para baixa: ");
                int pedido = leitor.nextInt();
                
                // Validação manual de regra de negócio
                if (pedido > 0 && pedido <= estoque) {
                    estoque -= pedido;
                    System.out.println("Baixa concluída. Novo estoque: " + estoque);
                } else {
                    System.out.println("Falha: Quantidade inválida ou insuficiente.");
                }
            }
        } while (opcao != 2);

        System.out.println("Encerrando sistema...");
        leitor.close();
    }
}