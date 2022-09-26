class ElevadorCorrigido {
    //Atributos:
    int andarAtual;
    int totalAndares;
    int capacidade;
    int quantPessoas;

    //Métodos
    ElevadorCorrigido(int totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.quantPessoas =0;
    }
    void entra(){
        if(this.quantPessoas < this.capacidade){
            this.quantPessoas += 1;
        }else{
            System.out.print("Elevador lotado !!");
        }   
    }
    void sai(){
        if(this.quantPessoas > 0){
            this.quantPessoas -= 1;
        }else{
            System.out.println("Elevador Vazio !!");
        }
    }
    void sobe(){
        if(this.andarAtual == totalAndares){
            System.out.println("Não é possivel subir mais !!");
        }else{
            this.andarAtual += 1;
        }
    }
    void descer(){
        if(this.andarAtual == 0){
            System.out.println("Não é possivel descer mais\nAndar no terreo.");
        }else{
            this.andarAtual -= 1;
        }
    }
}
