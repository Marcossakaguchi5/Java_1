package Aula24_10_2022;

public class Gato extends Mamiferos{
    private String corDoPelo;

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    void miar(){
        System.out.println("Miau!");
    }

}
