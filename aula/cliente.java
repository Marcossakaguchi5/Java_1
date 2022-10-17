package aula;

class Cliente {

//atributos
 private String nome;
private int idade;
private double rendaMensal;


//metodos
void alteraNome(String nome){
    this.nome=nome;
}
void alteraIdade(int idade){
    this.idade=idade;
}
void alterarenda(double renda){
    this.rendaMensal=renda;
}
String consultaNome(){
    return this.nome;
}
    int consulIdade(){
        return this.idade;
    }
    double consultarenda(){
        return this.rendaMensal;
    }
}
