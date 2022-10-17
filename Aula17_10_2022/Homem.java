package Aula17_10_2022;
public class Homem extends Mamifero {
    String corDaPele;

    void andar(){
        System.out.println("Homem andando");
    }
    void mostrarAtributos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Tipo sanguineo: "+this.tipoSanguineo);
        System.out.println("Cor de pele: "+this.corDaPele);
    }
}
