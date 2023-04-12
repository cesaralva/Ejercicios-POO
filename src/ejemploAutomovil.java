import java.util.Date;

public class ejemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("subaru", "Impresa");


        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);

        Automovil nissan = new Automovil("nissan", "bt-50", 2.0);
        System.out.println("nissan = " + nissan.getFabricante());

        Automovil mazda = new Automovil("mazda", "amarillo", Color.ROJO, 3.5, 60);

        Automovil nissan2 = new Automovil("nissan", "bt-50", 2.0);
        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales con equals? " + (nissan.equals(nissan2)));

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(nissan.verDetalle());
        System.out.println(mazda.acerarFrenar(4000));
        System.out.println(auto.equals(fecha));//no puede comparar no puede hacer cast
        System.out.println(auto.equals(nissan));

        //////////////// methods toString/////////////////////////////

        /*representar el objeto en una cadena  */
        System.out.println(nissan);// implicita
        System.out.println(nissan.toString());// explicita

////////////////////////////////////////////////////////////


// se trata de polimorfismo: diferentes formas de hacer lo mismo

        //principio de encapsulamiento que se confundo con el principio de ocultación
        System.out.println("kilometros por litro = " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litro = " + subaru.calcularConsumo(300, 60));


    }


}
