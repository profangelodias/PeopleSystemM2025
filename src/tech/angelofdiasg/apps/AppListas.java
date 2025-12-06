package tech.angelofdiasg.apps;

import tech.angelofdiasg.auxs.Telefone;
import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;

import java.util.*;

public class AppListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- ESTRUTURA 1: LISTA (ArrayList) ---
        System.out.println("\n=== CADASTRO DE FUNCIONÁRIOS (LISTA) ===");
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int qtfFunc = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        for (int i = 0; i < qtfFunc; i++) {
            // 1. Criar novo funcionário (objeto)
            Funcionario func = new Funcionario();
            // 2. Coletar os dados
            System.out.print("Nome do Funcionário " + (i + 1) + ": ");
            func.setNome(scanner.nextLine());

            System.out.print("Quantos telefones deseja cadastrar para " + func.getNome() + "? ");
            int qtdTelefones = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            for (int j = 1; j <= qtdTelefones; j++) {
                System.out.print("Digite o DDD do telefone " + j + ": ");
                String ddd = scanner.nextLine();
                System.out.print("Digite o número do telefone " + j + ": ");
                String numero = scanner.nextLine();
                func.adicionarTelefone(new Telefone(ddd, numero));
            }

            // 3. Adicionar à lista
            listaFuncionarios.add(func);
        }

        // Imprimir todos os funcionários cadastrados
        System.out.println("\n--- Funcionários Cadastrados (Lista) ---");
        for (Funcionario func : listaFuncionarios) {
            System.out.println("Nome: " + func.getNome());
            System.out.println("Telefones: " + func.getTelsContato());
        }

        // --- ESTRUTURA 2: LISTA DE CLIENTES ---
        System.out.println("\n=== CADASTRO DE CLIENTES (LISTA) ===");
        List<Cliente> listaClientes = new ArrayList<>();

        System.out.print("Quantos clientes deseja cadastrar? ");
        int qtdClientes = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        for (int i = 0; i < qtdClientes; i++) {
            Cliente cliente = new Cliente();
            System.out.print("Nome do Cliente " + (i + 1) + ": ");
            cliente.setNome(scanner.nextLine());

            System.out.print("Quantos telefones deseja cadastrar para " + cliente.getNome() + "? ");
            int qtdTelefones = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            for (int j = 1; j <= qtdTelefones; j++) {
                System.out.print("Digite o DDD do telefone " + j + ": ");
                String ddd = scanner.nextLine();
                System.out.print("Digite o número do telefone " + j + ": ");
                String numero = scanner.nextLine();
                cliente.adicionarTelefone(new Telefone(ddd, numero));
            }

            listaClientes.add(cliente);
        }

        System.out.println("\n--- Clientes Cadastrados (Lista) ---");
        for (Cliente cliente : listaClientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefones: " + cliente.getTelsContato());
        }

        Collections.sort(listaClientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.getNome().compareTo(c2.getNome());
            }
        });

        scanner.close();
    }
}
