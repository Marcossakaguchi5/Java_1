package Aula24_10_2022;

public class Mamiferos extends Animal{
    private String tipoSanguineo;

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    void mamar(){
        System.out.println("Mamifero está mamando ! ");
    }
}
