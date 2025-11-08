package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.auxs.Profissao;

public class Cliente extends Pessoa{
    private String codigo;
    private Profissao profissao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
