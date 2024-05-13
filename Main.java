import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaEspecialistaPerfumes sistema = new SistemaEspecialistaPerfumes();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Especialista de Perfumes!");

        int opcaoGenero = exibirMenu(scanner, "Selecione o gênero:\n1 - Masculino\n2 - Feminino\nOpção: ", 1, 2);
        String genero = (opcaoGenero == 1) ? "masculino" : "feminino";

        int opcaoClima = exibirMenu(scanner, "\nSelecione o clima:\n1 - Quente\n2 - Frio\nOpção: ", 1, 2);
        String clima = (opcaoClima == 1) ? "quente" : "frio";

        int opcaoTipo = exibirMenu(scanner, "\nSelecione o tipo de perfume:\n1 - Amadeirado\n2 - Doce\n3 - Floral\nOpção: ", 1, 3);
        String tipo = "";
        switch (opcaoTipo) {
            case 1:
                tipo = "amadeirado";
                break;
            case 2:
                tipo = "doce";
                break;
            case 3:
                tipo = "floral";
                break;
        }

        int opcaoDuracao = exibirMenu(scanner, "\nSelecione a duração da fragrância:\n1 - Curta\n2 - Média\n3 - Longa\nOpção: ", 1, 3);
        String duracao = "";
        switch (opcaoDuracao) {
            case 1:
                duracao = "curta";
                break;
            case 2:
                duracao = "média";
                break;
            case 3:
                duracao = "longa";
                break;
        }

        int opcaoIntensidade = exibirMenu(scanner, "\nSelecione a intensidade:\n1 - Leve\n2 - Moderada\n3 - Forte\nOpção: ", 1, 3);
        String intensidade = "";
        switch (opcaoIntensidade) {
            case 1:
                intensidade = "leve";
                break;
            case 2:
                intensidade = "moderada";
                break;
            case 3:
                intensidade = "forte";
                break;
        }

        int opcaoOcasiao = exibirMenu(scanner, "\nSelecione a ocasião de uso:\n1 - Casual\n2 - Formal\n3 - Esporte\nOpção: ", 1, 3);
        String ocasiao = "";
        switch (opcaoOcasiao) {
            case 1:
                ocasiao = "casual";
                break;
            case 2:
                ocasiao = "formal";
                break;
            case 3:
                ocasiao = "esporte";
                break;
        }
        
        int opcaoValor = exibirMenu(scanner, "\nSelecione o valor do perfume:\n1 - Até R$50\n2 - R$51 a R$100\n3 - R$101 a R$150\n4 - Acima de R$150\nOpção: ", 1, 4);
        double valor = 0.0;
        switch (opcaoValor) {
            case 1:
                valor = 50.0;
                break;
            case 2:
                valor = 100.0;
                break;
            case 3:
                valor = 150.0;
                break;
            case 4:
                valor = 200.0; // Considerando acima de R$150 como R$200
                break;
        }

        List<Perfume> recomendacoes = sistema.recomendarPerfumes(genero, clima, tipo, duracao, intensidade, ocasiao, valor);
        if (recomendacoes.isEmpty()) {
            System.out.println("\nNenhum perfume recomendado para as preferências selecionadas.");
        } else {
            System.out.println("\nPerfumes recomendados:");
            for (Perfume perfume : recomendacoes) {
                System.out.println(perfume.toString());
            }
        }

        scanner.close();
    }

    private static int exibirMenu(Scanner scanner, String mensagem, int min, int max) {
        int opcao = 0;
        boolean entradaValida = false;
        do {
            System.out.print(mensagem);
            try {
                opcao = scanner.nextInt();
                if (opcao >= min && opcao <= max) {
                    entradaValida = true;
                } else {
                    System.out.println("Opção inválida! Por favor, selecione uma opção entre " + min + " e " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número válido.");
                scanner.next(); // Limpa o buffer do scanner
            }
        } while (!entradaValida);
        return opcao;
    }
}
