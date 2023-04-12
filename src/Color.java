public enum Color {
    /*Un enumerador es una coleccion de valores constates o atributos constates
    * Con el enumerador queda mejor sistematizado y mejor acoplado es mas recomendable que
    * que hacerlo de 1 sola forma
    *
    * */


    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJO("Naranjo");

    private final String color;


    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }

    public String getColor() {
        return color;


    }
}
