package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;

public abstract class Cuenta_bancaria {
    private  String nombreTitular;
    private   String apellidosTitular;
    private   String numeroCuenta;
    private   double saldo;
    private    boolean estado;
    private final Collection<Transaccion> listaTransacciones;

    public Cuenta_bancaria(String nombreTitular, String apellidosTitular, String numeroCuenta){
        this.nombreTitular = nombreTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.estado = true;
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

    public  boolean isEstado() {
        return estado;
    }

    public  void setEstado(boolean estado) {
        this.estado = estado;
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

    public abstract void retirar(double valor);

    public void depositar(double valor) {
        assert valor > 0 : "Deposita una cantidad de dinero";
        double saldoNuevo = getSaldo() + valor;
        setSaldo(saldoNuevo);
        setEstado(true);
    }

    public void agregarTransaccion(Transaccion transaccion) {
     listaTransacciones.add(transaccion);
    }
    public String consultarSaldo() {
       String saldoConsultado = "";
       double valorConsultado = 0;
        if(isEstado()== true){
            valorConsultado = valorConsultado + getSaldo();
            saldoConsultado = "Su saldo es de: " + getSaldo();
       }
       else{
        saldoConsultado = " cuenta  desactivada";
       }
        return saldoConsultado;
    }

}
