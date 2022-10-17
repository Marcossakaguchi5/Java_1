package aula;

class Funcionario{

    //atributos
    String nome ;
    Double altura;
    static String nacionalidade; 


//metodos
 static void mostraNascionalidade(){
    System.out.println("nascionalidade");
    System.out.println(Funcionario.nacionalidade);
}
static void alteraNacionalidade(String novanacionalidade){
Funcionario.nacionalidade = novanacionalidade;}

 }