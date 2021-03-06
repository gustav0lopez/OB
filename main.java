public class main{

    public static void main (String[] args){
        System.out.println(suma(1,5,7));
        
        coche miCoche = new coche();
        miCoche.addPuerta();
        System.out.println(miCoche.puertas);

        System.out.println("#Ejercicios condicionales#");
        System.out.println("#IF#");

        int puertas = 1 ;
        if (puertas>0){
            System.out.println("Es mayor que 0 ");
        }

        System.out.println("## WHILE ##");
        
        int numeroWhile = 0 ;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        

        System.out.println("## DO WHILE ##");

        int numeroDoWhile = 0;
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile<1);

        System.out.println("## FOR ##");

        for(int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("## SWITCH CASE ##");

        var estacion = "INVIERNO";

        switch(estacion){
            case "VERANO":
            System.out.println("Es verano");
            break;
            case "INVIERNO":
            System.out.println("Es inverno");
            break;
            case "OTOÑO":
            System.out.println("Es otoño");
            break;
            case "PRIMAVERA":
            System.out.println("Es primavera");
            break;
            default: System.out.println("No es una estación");
        }

        System.out.println("#Ejercicios Privacidad, abstracción y encapsulación#");
        System.out.println("#####");

        persona humano = new persona();
        humano.setEdad(35);
        humano.setNombre("Gustavo");
        humano.setTelefono(123456789);
        System.out.println("Edad de "+humano.getNombre()+" es de "+humano.getEdad()+ " y su teléfono es " + humano.getTelefono());

        System.out.println("########## TEMA 9 ####################");

        cliente cliente = new cliente();
        cliente.setNombre("Gustavo Cliente");
        cliente.setEdad(35);
        cliente.setTelefono(123456);
        cliente.setCredito("aprobado");
        System.out.println("Nombre: "+cliente.getNombre()+" Edad:"+cliente.getEdad()+ "Teléfono: "+cliente.getTelefono()+" Credito: "+cliente.getCredito());

        trabajador trabajador = new trabajador();
        trabajador.setNombre("Gustavo Cliente");
        trabajador.setEdad(35);
        trabajador.setTelefono(123456);
        trabajador.setSalario(123);
        System.out.println("Nombre: "+trabajador.getNombre()+" Edad:"+trabajador.getEdad()+ "Teléfono: "+trabajador.getTelefono()+" Salario "+trabajador.getSalario());
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
//Ejercicios de: Privacidad, abstracción y encapsulación 
}
class persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad = edad ;
    }
    public int getEdad (){
        return edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getTelefono (){
        return telefono;
    }


}

// Tema 9

class cliente extends persona {
    String credito;

    public void setCredito(String credito){
        this.credito=credito;
    }
    public String getCredito(){
        return credito;
    }

}

class trabajador extends persona {
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return salario;
    }
}


    
