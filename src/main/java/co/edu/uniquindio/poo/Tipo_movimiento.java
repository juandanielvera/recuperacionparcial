package co.edu.uniquindio.poo;

public enum Tipo_movimiento {
    DEPOSITO("Deposito"),
    RETIRO("Retiro");
    private final String Tipo;

    private Tipo_movimiento(String tipo) {
        Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

}