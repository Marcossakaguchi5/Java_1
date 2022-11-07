package Aula07112022.Object;

public class Repositorio {
    private Object[] objetos =  new Object[100];
    static private int numIndex = 0;

    public void adiciona(Object o){
        objetos[numIndex] = 0;
        numIndex += 1; 
    }

    public void removeUltimoObj(){
        numIndex -= 1;
    }
    public Object retornaUltimoObj(){
        return objetos[numIndex];
    }
}
