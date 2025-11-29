package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.auxs.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected ListaDeTelefonesNaoOrdenados telsContato;
    protected Endereco endereco;

    public int obterIdade(){
        // diferença dinâmica entre data de nascimento e data atual (anos completos)
        if (dataNascimento == null) {
            return 0;
        }
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        this.telsContato = telsContato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
