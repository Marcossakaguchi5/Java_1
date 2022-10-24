package ExercicioAula24_10_2022;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RelogioPonto {

    private String obterDataHora(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        return sdf.format(agora);
    }
    void registrarEntrar(Funcionario funcionario){
        
        System.out.println("### REGISTRO DE ENTRADA ###");
        System.out.println("ENTRADA "+funcionario.getNome());
        System.out.println("DATA: "+this.obterDataHora());
        System.out.println("---------------------------\n");
    }
    void registrarSaida(Funcionario funcionario){
        System.out.println("#### REGISTRO DE SAIDA ####");
        System.out.println("SAIDA "+funcionario.getNome());
        System.out.println("DATA: "+this.obterDataHora());
        System.out.println("---------------------------\n");
    }
}
