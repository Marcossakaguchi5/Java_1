package Aula17_10_2022;
public class Homem extends Mamifero {
    String corDaPele;

    Homem(){
        System.out.println("Homem Construido");
    }
    
    void andar(){
        System.out.println("Homem andando");
    }
    void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Tipo sanguineo: "+this.tipoSanguineo);
        System.out.println("Cor de pele: "+this.corDaPele);
    }
}
