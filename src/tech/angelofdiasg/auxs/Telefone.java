package tech.angelofdiasg.auxs;

public class Telefone {
    private String ddd;
    private String numeroTelefone;

    public Telefone() {
        // construtor padrão
    }

    public Telefone(String ddd, String numeroTelefone) {
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
