public class Automovil { // clase entidad representa la clase de la application las clases se crean con mayusculas tipo oracion
    private int id = 0;


    private String fabricante = "nissan";
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadtanque = 40;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadtanqueEstatico = 30;
    private static int ultimoId;


    //ahora instanciamos

//funciones de los metodos // dentro de los parametros o parentesis entarn la clase metodo
    //no se debe imprimir en el metodo


    ////////////////////////atributo final //////////////////////
/*CAMBIA UN POCO la nomenclatura de la cual se deben escribir las constantes
 co la variable da la clase igual que la constate

 Estos son parametros o estructuras constantes
 */
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "gris Oscuro";

    ///////////////////////////////////////////////////////////////

    ///////////constructor vacio ( se modifico para ingresar el incremento du ID ////////////////////
    public Automovil() {
        this.id = ++ultimoId;

    }

    /////////////////////////////////////////

    ////////////////////Re uso dul constructor///////////////////
    public Automovil(String fabricante, String modelo, double cilindrada) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo);
        this.color = color;

    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadtanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadtanque = capacidadtanque;
    }
////////////////////////////////////////////

    ////// get para obtener y set para modificar/////////


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadtanque() {
        return capacidadtanque;
    }

    public void setCapacidadtanque(int capacidadtanque) {
        this.capacidadtanque = capacidadtanque;
    }

    //////////////////// clase static///////////////////////
    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadtanqueEstatico() {
        return capacidadtanqueEstatico;
    }

    public static void setCapacidadtanqueEstatico(int capacidadtanqueEstatico) {
        Automovil.capacidadtanqueEstatico = capacidadtanqueEstatico;
    }


//////////////////////////////////////////////////////////


    public String verDetalle() {
        //se usa para concatena r cadenas
        return "auto.id = " + this.id +
                "\nauto = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + cilindrada +
                "\nmodelo = " + modelo +
                "\nauto.patenteColor = " + Automovil.colorPatente;


    }

    //otro metodo
    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando";
    }

    public String acerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadtanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadtanque * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadtanqueEstatico * (porcentajeBencina / 100f));
    }


    ///////////Principio de polimorfismo///////////////
    /*Modificar el equals para hacer la comparacion*/
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }
    ///////////////////////////////////////////////////

    /////////// invocando el metodo toString////////////////////
    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadtanque=" + capacidadtanque +
                ", id =" + id +
                '}';
    }

    ////////////////////////////////////////
}


