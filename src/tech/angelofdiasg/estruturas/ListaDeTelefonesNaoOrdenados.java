package tech.angelofdiasg.estruturas;

import tech.angelofdiasg.auxs.Telefone;

import java.util.Arrays;

public class ListaDeTelefonesNaoOrdenados {
    //Vetor de telefones onde criaremos nossa lista
    private Telefone[] telefones;
    //Controlar o tamanho da lista - O QUANTO EU JÁ GUARDEI
    private int tamanhoLista;
    //Capacidade inicial de 3 elementos (pode ser alterada depois) - O QUANTO EU POSSO GUARDAR
    private static final int CAPACIDADE_PADRAO = 3;
    //Nosso código robusto para garantir capacidade
    private int capacidadePadrao = CAPACIDADE_PADRAO;

    public int getCapacidadePadrao() {
        return capacidadePadrao;
    }

    //Construtor da lista
    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanhoLista = 0;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0;
    }
    public boolean isFull() {
        return this.tamanhoLista == CAPACIDADE_PADRAO + 1;
    }

    public void adicionarTelefone(Telefone telefone) {
        //Verificar length em tempo real a capacidade "atual" da lista
        if (this.tamanhoLista < CAPACIDADE_PADRAO) {
            //tamanho é o "index+1", usar o tamanho para adicionar
            this.telefones[this.tamanhoLista] = telefone;
            //incrementar o tamanho
            this.tamanhoLista = this.tamanhoLista + 1;
        } else {
            System.out.println("Não há mais espaço para adicionar " + telefone);
        }
    }

    public void removerTelefone(Telefone telefone){
        int indice = buscarTelefoneIndex(telefone);
        if (indice != -1){
            //Deslocar os elementos para a esquerda para sobrepor o telefone removido
            for (int i = indice; i < this.tamanhoLista - 1; i++){
                this.telefones[i] = this.telefones[i + 1];
            }
            //Reduzir o tamanho da lista
            this.tamanhoLista = tamanhoLista -1;
            telefones[tamanhoLista] = null; // Limpar a última posição
            System.out.println("Telefone " + telefone + " removido com sucesso.");
        } else {
            System.out.println("Não tem o " + telefone + " para ser removido.");
        }
    }

    //Procurar o indice(index) do telefone no VETOR
    private int buscarTelefoneIndex(Telefone telefone){
        for(int i = 0; i < this.tamanhoLista; i++){
            //validar se o tefoene existe
            if(this.telefones[i].equals(telefone)){
                return i;
            }
        }
        //Se não encontrar retorna um valor "inválido"
        System.out.println("Telefone não encontrado na lista.");
        return -1;
    }

    @Override
    public String toString() {
        return "ListaDeTelefonesNaoOrdenados{" +
                "telefones=" + Arrays.toString(telefones) +
                '}';
    }
}
