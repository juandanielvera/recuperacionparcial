package co.edu.uniquindio.poo;

public class Cuenta_ahorros extends Cuenta_bancaria {
   
    public double TasaInteres;

    public Cuenta_ahorros(String nombreTitular, String apellidosTitular, String numeroCuenta, double TasaInteres){
       super(nombreTitular, apellidosTitular, numeroCuenta);
        this.TasaInteres = TasaInteres;
    }

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        TasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "Cuenta_ahorros [tasaInteres=" + TasaInteres + "]";
    }

    @Override
    public  void retirar(double valor) {
        assert valor > 0;
        if (getSaldo() >= valor) {
            double saldoNuevo = getSaldo() - valor;
            setSaldo(saldoNuevo);
        } else {
           System.out.print("No hay fondos  suficientes  para realizar este retiro.");
        }
    }

    public static void crearCuenta_ahorros(String nombreTitular, String apellidoTitular, String numeroCuenta,
            double TasaInteres) {
        Cuenta_ahorros cuenta_ahorro = new Cuenta_ahorros( nombreTitular, apellidoTitular,  numeroCuenta, TasaInteres);
        Banco.agregarCuenta(cuenta_ahorro);
    }
}
