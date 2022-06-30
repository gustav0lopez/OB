public class main {

    public static void main (String[] args){
        System.out.println(suma(1,5,7));
        coche miCoche = new coche();
        miCoche.addPuerta();
        System.out.println(miCoche.puertas);
    }

     public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class coche {
    public int puertas = 3;

    public void addPuerta(){
        this.puertas++;
    }
}