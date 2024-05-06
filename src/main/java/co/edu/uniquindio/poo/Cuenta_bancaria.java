package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;

public abstract class Cuenta_bancaria {
    private  String nombreTitular;
    private   String apellidosTitular;
    private   String numeroCuenta;
    private   double saldo;
    private  static boolean estado;
    private final Collection<Transaccion> listaTransacciones;

    public Cuenta_bancaria(String nombreTitular, String apellidosTitular, String numeroCuenta){
        this.nombreTitular = nombreTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        Cuenta_bancaria.estado = true;
        this.listaTransacciones = new LinkedList<>();
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public  double getSaldo() {
        return saldo;
    }

    public  void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static boolean isEstado() {
        return estado;
    }

    public static void setEstado(boolean estado) {
        Cuenta_bancaria.estado = estado;
    }

    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }
    @Override
    public String toString() {
        return "CuentaBancaria [nombreTitular=" + nombreTitular + ", apellidosTitular=" + apellidosTitular
                + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", estado=" + estado + ", listaTransacciones="
                + listaTransacciones + "]";
    }

    public abstract void retirar(int valor);

    public  void depositar(double valor) {
        assert valor > 0 : "Deposita un valor positivo";
        saldo = saldo + valor;
        estado = true;
    }

    public void agregarTransaccion(Transaccion transaccion) {
     listaTransacciones.add(transaccion);
    }

}
