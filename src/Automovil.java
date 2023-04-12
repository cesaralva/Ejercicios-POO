public class Automovil { // clase entidad representa la clase de la application las clases se crean con mayusculas tipo oracion
    private String fabricante = "nissan";
    private String modelo;
    private String color = "Verde";
    private double cilindrada;
    private int capacidadtanque = 40;
    //ahora instanciamos

//funciones de los metodos // dentro de los parametros o parentesis entarn la clase metodo
    //no se debe imprimir en el metodo

    ///////////constructor vacio////////////////////
    public Automovil() {
    }

    /////////////////////////////////////////

    ////////////////////Re uso dul constructor///////////////////
    public Automovil(String fabricante, String modelo, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo);
        this.color = color;

    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadtanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadtanque = capacidadtanque;
    }
////////////////////////////////////////////

    ////// get para obtener y set para modificar/////////
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    //////////////////////////////////////////////////////////
    public String verDetalle() {
        //se usa para concatena r cadenas
        return "auto = " + this.fabricante +
                "auto.modelo = " + this.modelo +
                "auto.color = " + this.color +
                "auto.cilindrada = " + cilindrada +
                "modelo = " + modelo;

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


    ///////////Principio de polimorfismo///////////////
    /*Modificar el equals para hacer la comparacion*/
    @Override
    public boolean equals(Object obj) {

        if (this == obj){
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
}
