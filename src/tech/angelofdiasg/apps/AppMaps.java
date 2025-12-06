package tech.angelofdiasg.apps;

import tech.angelofdiasg.pessoas.Funcionario;

import java.util.HashMap;
import java.util.Map;

public class AppMaps {
    public static void main(String[] args) {
        // CHAVE-VALOR
        // KEY-VALUE
        // ESTRUTURA 4: MAPAS (MAPS)
        Map<Integer, Funcionario> bancoDeDadosFacilRH = new HashMap<>();

        Funcionario func = new Funcionario();
        func.setNome("AngelofDiasG");
        func.setMatricula(01);

        bancoDeDadosFacilRH.put(func.getMatricula(), func);

        for(Map.Entry<Integer, Funcionario> registo : bancoDeDadosFacilRH.entrySet()){
            System.out.println("Matrícula: " + registo.getKey());
            System.out.println("Funcionário: " + registo.getValue().getNome());
        }

    }
}
