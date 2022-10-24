package Aula24_10_2022;

public class ClinicaTeste {
    public static void main(String[] args){
        Cachorro cleiton = new Cachorro();
        cleiton.setDataDeNascimento("11/09/2001");
        cleiton.setEspecie("Cachorro");
        cleiton.setGenero("Macho");
        cleiton.setNome("Cleiton Robersval da Silva Carvalho");
        cleiton.setRaca("Red-bull");
        cleiton.setTipoSanguineo("HDR");

        Gato tobias = new Gato();
        tobias.setCorDoPelo("Laranja");
        tobias.setDataDeNascimento("15/06/1587");
        tobias.setEspecie("Gato");
        tobias.setGenero("Helicoptero de combate");
        tobias.setTipoSanguineo("HDMI");
        tobias.setNome("Tobias Clodoaldo");

        Clinica c = new Clinica();
        c.setEndereco("Avenida Tamoios 875");
        c.setNomeClinica("Pastelaria do China");

        c.realizarCirurgia(tobias);
        c.realizarCirurgia(cleiton);
    }
}
