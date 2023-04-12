public class ejemploAutomovilStatic {
    public static void main(String[] args) {


        Automovil.setCapacidadtanqueEstatico(45);


        Automovil subaru = new Automovil("subaru", "Impresa");

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);


        Automovil nissan = new Automovil("nissan", "bt-50", 2.0);


        Automovil mazda = new Automovil("mazda", "amarillo", Color.ROJO, 3.5, 60);

        Automovil nissan2 = new Automovil("nissan", "bt-50",Color.AZUL, 2.0);

        Automovil auto = new Automovil();
        Automovil.setColorPatente(Color.AZUL);


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println("auto = " + Automovil.getColorPatente());
        System.out.println("kilometros por litro = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("velocidad maxima de carretera = " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("velocidad maxima en ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);
    }


}
