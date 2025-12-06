package tech.angelofdiasg.apps;

import tech.angelofdiasg.auxs.Telefone;
import tech.angelofdiasg.pessoas.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class AppPilhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ESTRUTURA 3: PILHA (Stack)
        Stack<Funcionario> pilhaAdmissao = new Stack<>();
        Stack<Telefone> historicoTelefones = new Stack<>();
        //ESTRUTURA ANTERIOR: LISTA (ArrayList)
        List<Funcionario> funcionariosAdmitidos = new ArrayList<>();

        System.out.println("\n=== FUNCIONÁRIOS PARA ADMISSÃO ===");
        System.out.print("Quantos funcionários deseja cadastrar para admissão? ");
        int qtdFuncAdmissao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        // ESTRUTURA DE REPETIÇÃO PARA ADMISSÃO DOS FUNCIONÁRIOS - Apenas NOME
        for (int i = 0; i < qtdFuncAdmissao; i++) {
            Funcionario func = new Funcionario();
            System.out.print("Nome do Funcionário " + (i + 1) + ": ");
            func.setNome(scanner.nextLine());
            pilhaAdmissao.push(func); // ADICIONA O FUNCIONÁRIO NA PILHA
        }

        // IMPRIMIR A PILHA DE FUNCIONÁRIOS A SEREM ADMITIDOS
        System.out.println("\n--- Pilha de Funcionários para Admissão ---");
        for (Funcionario f : pilhaAdmissao) {
            System.out.println("Nome: " + f.getNome());
        }

        while (!pilhaAdmissao.isEmpty()) {
            Funcionario func = pilhaAdmissao.pop();
            System.out.println("Funcionário Admitido: " + func.getNome());
            funcionariosAdmitidos.add(func);
        }

        System.out.println("\n--- Lista de Funcionários Admitidos ---");
        for (Funcionario func : funcionariosAdmitidos) {
            System.out.println("Nome: " + func.getNome());

            for (int j = 1; j <= 2; j++) {
                System.out.print("Digite o DDD do telefone " + j + ": ");
                String ddd = scanner.nextLine();
                System.out.print("Digite o número do telefone " + j + ": ");
                String numero = scanner.nextLine();
                func.adicionarTelefone(new Telefone(ddd, numero));
                historicoTelefones.push(new Telefone(ddd, numero));
            }
        }

        System.out.println("\n--- Histórico de Telefones dos Funcionários Admitidos ---");
        for (Telefone tel : historicoTelefones) {
            System.out.println("Telefone: (" + tel.getDdd() + ") " + tel.getNumeroTelefone());
        }



        //DESAFIO - OK
        // TIRAR DA PILHA E ADICIONAR A UMA LISTA DE FUNCIONÁRIOS ADMITIDOS
        // IMPRIMIR A LISTA DE FUNCIONÁRIOS ADMITIDOS

        //DESAFIO 2 (OPCIONAL SE QUISER QUE SEJA) - OK
        // CADASTRAR 2 TELEFONES PARA CADA FUNCIONÁRIO AO ADMITI-LO
        // IMPRIMIR UM HISTÓRICO DE TELEFONES DOS FUNCIONÁRIOS ADMITIDOS

        // DESAFIO 3 (OPCIONAL)
        // BUSCAR QUAL FUNCIONÁRIO TEM O NÚMERO DE TELEFONE RETIRADO DO HISTÓRICO (PILHA)

    }
}
