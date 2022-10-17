package aula;

public class funcionarioteste {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        Funcionario.nacionalidade="Brasileira";
       

        System.out.println("nacionalidade do funcionario: "+f1.nacionalidade);
        Funcionario.mostraNascionalidade();
    
            System.out.print("======================"); 
    
        Funcionario.alteraNacionalidade("boi");
        Funcionario.mostraNascionalidade();
        
        Cliente c1 = new Cliente();
        c1.alteraNome("panco");
        c1.alteraIdade(18);
        c1.alterarenda(18060.0);
       
        System.out.println(" Nome:" +c1.consultaNome());
        System.out.println("Idade: "+c1.consulIdade());
        System.out.println("renda: "+c1.consultarenda()); 

    }
    
}
