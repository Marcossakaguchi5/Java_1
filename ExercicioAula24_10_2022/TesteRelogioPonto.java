package ExercicioAula24_10_2022;

public class TesteRelogioPonto {
    public static void main(String [] args){
        Diretor a = new Diretor();
        Engenheiro b = new Engenheiro();
        Gerente c = new Gerente();
        Secretario d = new Secretario();

        RelogioPonto e = new RelogioPonto();

        a.setNome("Calil");
        a.setSalario(13000.00);
        a.setCodDiretor(1);

        b.setNome("Marcelo");
        b.setSalario(7500.00);
        b.setCodEngenheiro(468);

        c.setNome("Carlos");
        c.setSalario(5000.00);
        c.setCodGerente(497);

        d.setNome("Roberto");
        d.setSalario(2750.50);
        d.setCodSecretario(5486);

        e.registrarEntrar(a);
        e.registrarEntrar(b);
        e.registrarEntrar(c);
        e.registrarEntrar(d);
        System.out.println("\nDia Trabalhado\n");
        e.registrarSaida(a);
        e.registrarSaida(b);
        e.registrarSaida(c);
        e.registrarSaida(d);
    }

    public TesteRelogioPonto() {
    }
}
