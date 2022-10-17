package Aula17_10_2022;
public class TesteHeranca {
    
    public static void main(String[] args){
        Homem claudio = new Homem();
        claudio.nome = "Claudio Pereira";
        claudio.idade = 69;
        claudio.tipoSanguineo = "O-";
        claudio.corDaPele = "Amarelo";
        claudio.mostrarAtributos();

        Cachorro clodovil =  new Cachorro();
        clodovil.nome = "Clodovil";
        clodovil.idade = 3;
        clodovil.tipoSanguineo = "DEA7";
        clodovil.corDoPelo = "Castanho";    


        BeijaFlor cleber = new BeijaFlor();
        cleber.nome = "Cleber";
        cleber.idade = 1;
        cleber.corDePena ="Albino";
        cleber.tamanhoDoBico = 30;

    }
}
