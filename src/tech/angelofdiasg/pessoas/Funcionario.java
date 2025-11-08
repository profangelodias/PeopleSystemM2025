package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.auxs.Cargo;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public void reajustarSalario(double percentual){
        if (percentual > 0){
            salario += salario * (percentual / 100);
        }
    }

    public Cargo promover(Cargo novoCargo){
        this.cargo = novoCargo;
        return this.cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", cargo=" + cargo +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", telsContato=" + telsContato +
                ", endereco=" + endereco +
                '}';
    }
}
