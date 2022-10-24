package Aula24_10_2022;

public class Cachorro extends Mamiferos {
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    void latir(){
        System.out.println("Au! Au!");
    }
}
