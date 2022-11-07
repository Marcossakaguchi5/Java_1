package Aula07112022.Task;

import Aula07112022.Domain.*;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return("Funcionario - Nome: "+this.getNome()+" Funcionario - Cargo: "+this.getCargo()+" Funcionario - Salario: "+this.getSalario());
    }

    public void calcularSalario(double valor){
        if(valor < 0){
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }else{
            this.salario = (this.getIdade()*valor);
        }
    }
} 
