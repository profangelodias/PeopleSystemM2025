package tech.angelofdiasg.apps;

import tech.angelofdiasg.pessoas.Cliente;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AppFilas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Fila de atendimento (queue) ");

        // ESTRUTURA 3: FILA (Queue)
        Queue<Cliente> filaLoja = new LinkedList<>();

        System.out.print("Quantos clientes chegaram na loja? ");
        int qtdClientes = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        // ESTRUTURA DE REPETIÇÃO PARA ADIÇÃO DOS CLIENTES NA FILA
        for (int i = 0; i < qtdClientes; i++) {
            Cliente cliente = new Cliente();
            System.out.print("Nome do Cliente " + (i + 1) + ": ");
            cliente.setNome(scanner.nextLine());

            System.out.println("Código do Cliente: " + (i + 1));
            cliente.setCodigo(scanner.nextLine());

            // ENFILEIRAR O CLIENTE
            filaLoja.offer(cliente); // ADICIONA O CLIENTE NA FILA
        }

        // ATENDER OS CLIENTES NA FILA
        System.out.println("\n--- Atendendo Clientes na Fila ---");
        while (!filaLoja.isEmpty()) {
            Cliente clienteAtendido = filaLoja.poll(); // DESENFILEIRA O CLIENTE
            System.out.println("Atendendo senha: " + clienteAtendido.getCodigo() +
                    " - Sr(a). " + clienteAtendido.getNome());
        }

    }
}
