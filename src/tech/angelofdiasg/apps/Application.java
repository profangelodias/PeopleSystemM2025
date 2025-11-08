package tech.angelofdiasg.apps; // declara o pacote desta classe

import tech.angelofdiasg.auxs.Endereco; // importa a classe Endereco do pacote auxs
import tech.angelofdiasg.auxs.Telefone; // importa a classe Telefone do pacote auxs
import tech.angelofdiasg.pessoas.Pessoa; // importa a classe Pessoa do pacote pessoas
import java.time.LocalDate; // importa LocalDate para manipular datas

public class Application { // início da classe Application
    public static void main(String[] args) { // metodo main: ponto de entrada da aplicação
        Pessoa pessoa1 = new Pessoa(); // cria uma instância de Pessoa chamada pessoa1
        Pessoa pessoa2 = new Pessoa(); // cria outra instância de Pessoa chamada pessoa2
        pessoa1.setDataNascimento(LocalDate.of(1999, 9, 18)); // define dataNascimento de pessoa1 para 18/09/1999
        pessoa1.setNome("Anjinho Tá Demais"); // define o nome da pessoa1
        Telefone tel1 = new Telefone("11","99999-9999"); // cria um objeto Telefone com DDD e número
        pessoa1.setTelsContato(tel1); // associa o telefone tel1 como contato de pessoa1
        Endereco endereco1 = new Endereco("Rua 1","casa",
                "1","Bairro Um","Cidade 1","5555555"); // cria um Endereco com logradouro, tipo, número, bairro, cidade e CEP
        pessoa1.setEndereco(endereco1); // atribui endereco1 a pessoa1
        pessoa2.setEndereco(endereco1); // atribui o mesmo endereco1 a pessoa2 (compartilhado)
        pessoa1.getEndereco().setLogradouro("Rua 2"); // altera o logradouro do endereço via pessoa1 (impacta pessoa2 também por compartilhamento)
        System.out.println("Sou novinho, tenho " + pessoa1.obterIdade() + " anos."); // imprime a idade calculada de pessoa1
        System.out.println("Meu nome é " + pessoa1.getNome() + "."); // imprime o nome de pessoa1
        System.out.println("Meu telefone é (" + pessoa1.getTelsContato().getDdd()
                + ") " + pessoa1.getTelsContato().getNumeroTelefone() + "."); // imprime o telefone com DDD e número
        System.out.println("Moro na " + pessoa1.getEndereco().getLogradouro() + ", número " + pessoa1.getEndereco().getNumero() + ", " +
                pessoa1.getEndereco().getBairro() + ", " + pessoa1.getEndereco().getCidade() + ", CEP " + pessoa1.getEndereco().getCep() + "."); // imprime o endereço completo

    } // fim do metodo main
} // fim da classe Application
