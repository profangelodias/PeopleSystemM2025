package tech.angelofdiasg.apps; // declara o pacote desta classe

import tech.angelofdiasg.auxs.Endereco; // importa a classe Endereco do pacote auxs
import tech.angelofdiasg.auxs.Telefone; // importa a classe Telefone do pacote auxs
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.Funcionario;
import tech.angelofdiasg.pessoas.Pessoa; // importa a classe Pessoa do pacote pessoas
import java.time.LocalDate; // importa LocalDate para manipular datas

public class Application { // início da classe Application
    public static void main(String[] args) { // metodo main: ponto de entrada da aplicação
        Funcionario func1 = new Funcionario();
        func1.setNome("Carlos Silva");
        func1.setDataNascimento(LocalDate.of(1985, 5, 20));
        Telefone telFunc1 = new Telefone("11", "78888-7777");
        Telefone telFunc2 = new Telefone("21", "88888-7777");
        Telefone telFunc3 = new Telefone("31", "98888-7777");

        ListaDeTelefonesNaoOrdenados lista1 = new ListaDeTelefonesNaoOrdenados();

        lista1.adicionarTelefone(telFunc1);
        lista1.adicionarTelefone(telFunc2);
        lista1.adicionarTelefone(telFunc3);

        func1.setTelsContato(lista1);
        System.out.println("lista completa " + func1.getTelsContato());

        func1.getTelsContato().removerTelefone(telFunc1);

        System.out.println("lista incompleta " + func1.getTelsContato());

        Endereco endFunc1 = new Endereco("Avenida Central", "Apto 101",
                "100", "Centro", "Rio de Janeiro", "20000000");
        func1.setEndereco(endFunc1);

        System.out.println(func1);


    } // fim do metodo main
} // fim da classe Application
