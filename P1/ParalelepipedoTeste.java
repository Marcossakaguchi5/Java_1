package P1;
class ParalelepipedoTeste {
    public static void main(String[] args){
        ParalelepipedoCorrigido p = new ParalelepipedoCorrigido(3, 4, 2);
        
        System.out.println("Volume: "+p.calculaVolume());
        System.out.println("Area da face 1: "+p.calculaAreaFace(1));
        System.out.println("Area da face 2: "+p.calculaAreaFace(2));
        System.out.println("Area da face 3: "+p.calculaAreaFace(3));
        System.out.println("Volume: "+p.calculaAreaTotal());
    }
}
