package co.edu.uniquindio.poo;

public class Cuenta_corriente extends Cuenta_bancaria{

    public double SobreGiro;

    public Cuenta_corriente(String nombreTitular, String apellidosTitular, String numeroCuenta, double SobreGiro){
        super(nombreTitular, apellidosTitular, numeroCuenta);
        this.SobreGiro = SobreGiro;
        
    }

    public double getSobreGiro() {
        return SobreGiro;
    }

    public void setSobreGiro(double sobreGiro) {
        SobreGiro = sobreGiro;
    }
    @Override
    public String toString() {
        return "Cuenta_corriente [SobreGiro=" + SobreGiro + "]";
    }

    @Override
    public void retirar(double valor) {
        assert valor > 0;
        assert SobreGiro > 0;
        if(valor<=getSaldo()){
            double saldoNuevo = getSaldo() - valor;
            setSaldo(saldoNuevo);
        }
        else if(SobreGiro+getSaldo()>valor){
            
            setSaldo(getSaldo()-valor);
            double sobregiroNuevo = SobreGiro - valor;
            SobreGiro = sobregiroNuevo;
        }
        else{
            System.out.println("No tienes suficiente dinero(Pobre) ");
        }
        
    }

    public static void crearCuentaCorriente(String nombres, String apellidos,
    String numeroCuenta, double sobregiro) {
        Cuenta_corriente cuentaCorriente = new Cuenta_corriente(nombres, apellidos, numeroCuenta, sobregiro);
        Banco.agregarCuenta(cuentaCorriente);

    }

}
  
