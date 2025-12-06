package tech.angelofdiasg.apps; // declara o pacote desta classe

import tech.angelofdiasg.auxs.Endereco; // importa a classe Endereco do pacote auxs
import tech.angelofdiasg.auxs.Telefone; // importa a classe Telefone do pacote auxs
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.Funcionario;
import tech.angelofdiasg.pessoas.Pessoa; // importa a classe Pessoa do pacote pessoas
import java.time.LocalDate; // importa LocalDate para manipular datas
import java.util.ArrayList;
import java.util.List;

public class Application { // início da classe Application
    public static void main(String[] args) { // metodo main: ponto de entrada da aplicação
        //Criando o objeto funcionário
        Funcionario func1 = new Funcionario();
        func1.setNome("Carlos Silva");
        func1.setDataNascimento(LocalDate.of(1985, 5, 20));

        //Criar 3 telefones
        Telefone residencial = new Telefone("11", "78888-7777");
        Telefone celular = new Telefone("21", "88888-7777");
        Telefone empresarial = new Telefone("31", "98888-7777");

//        ListaDeTelefonesNaoOrdenados lista1 = new ListaDeTelefonesNaoOrdenados();//        lista1.adicionarTelefone(telFunc1);
//        lista1.adicionarTelefone(telFunc2);
//        lista1.adicionarTelefone(telFunc3);
//        func1.setTelsContato(lista1);

        System.out.println("lista de Telefones Vazio: " + func1.getTelsContato());

        func1.adicionarTelefone(residencial);
        System.out.println("lista de Telefones " + func1.getTelsContato());
        func1.adicionarTelefone(celular);
        System.out.println("lista de Telefones " + func1.getTelsContato());
        func1.adicionarTelefone(empresarial);
        System.out.println("lista de Telefones " + func1.getTelsContato());

        func1.getTelsContato().remove(residencial);

        System.out.println("lista de Telefones " + func1.getTelsContato());

        //NA APLICAÇÃO
        // CRIAR MAIS 3 FUNCIONÁRIOS
        Funcionario func2 = new Funcionario();
        func2.setNome("Ana Costa");
        func2.setDataNascimento(LocalDate.of(1990, 8, 15));

        Funcionario func3 = new Funcionario();
        func3.setNome("João Pereira");
        func3.setDataNascimento(LocalDate.of(1978, 3, 10));

        Funcionario func4 = new Funcionario();
        func4.setNome("Mariana Oliveira");
        func4.setDataNascimento(LocalDate.of(2000, 12, 5));

        // CRIAR UMA LISTA COM TODOS ELES
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(func1);
        listaDeFuncionarios.add(func2);
        listaDeFuncionarios.add(func3);
        listaDeFuncionarios.add(func4);

        // IMPRIMIR APENAS O NOME DOS FUNCIONARIOS DA LISTA
        System.out.println("Nomes dos Funcionários:");
        for (Funcionario funcionario : listaDeFuncionarios) {
            System.out.println(funcionario.getNome());
        }

        // LIMPAR A LISTA
        listaDeFuncionarios.clear();
        System.out.println("Lista de funcionários limpa: " + listaDeFuncionarios);


        Endereco endFunc1 = new Endereco("Avenida Central", "Apto 101",
                "100", "Centro", "Rio de Janeiro", "20000000");
        func1.setEndereco(endFunc1);

        System.out.println(func1);


    } // fim do metodo main
} // fim da classe Application
