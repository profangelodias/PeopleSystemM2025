package tech.angelofdiasg.pessoas;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public void reajustarSalerio(double percentual){
    }

    public Cargo promover(Cargo novoCargo){
        return null;
    }
}
