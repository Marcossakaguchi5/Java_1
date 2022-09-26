class ParalelepipedoCorrigido{
    //Atributos:
    double altura;
    double comprimento;
    double profundidade;

    //Métodos:
    ParalelepipedoCorrigido(double a, double c, double p){
        this.altura = a;
        this.comprimento = c;
        this.profundidade = p;
    }
    double calculaVolume(){
        double volume = this.altura*this.comprimento+this.profundidade;
        return volume; 
        //return double volume = this.altura*this.comprimento+this.profundidade;
    }
    double calculaAreaFace(int face){
        double areaFace = 0;

        if (face == 1 || face == 4){
            areaFace = this.comprimento*this.altura;
        }else if(face == 2 || face == 5){
            areaFace = this.comprimento*this.profundidade;
        }else if(face == 3 || face == 6){
            areaFace = this.profundidade+this.altura;
        }else{
            System.out.print("Está face não existe !!");
        }

        return areaFace;
    }
    double calculaAreaTotal(){
        double areaTotal = 0;

        areaTotal += this.calculaAreaFace(1)*2;
        areaTotal += this.calculaAreaFace(2)*2;
        areaTotal += this.calculaAreaFace(3)*2;

        return areaTotal;
    }
}
