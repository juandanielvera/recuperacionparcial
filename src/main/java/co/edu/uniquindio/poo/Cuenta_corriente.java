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
    public void retirar(int valor) {
        assert valor > 0;
        assert SobreGiro > 0;
        if(valor<=getSaldo()){
            double Nuevo_Saldo = getSaldo() - valor;
            setSaldo(Nuevo_Saldo);
        }
        else if(SobreGiro+getSaldo()>valor){

            setSaldo(getSaldo()-valor);
            double Nuevo_Sobregiro = SobreGiro - valor;
            SobreGiro = Nuevo_Sobregiro;
        }
        else{
            System.out.println("no hay  fondos suficientes ");
        }

    }

    public static void crearCuentaCorriente(String nombreTitular, String apellido,
    String numeroCuenta, double SobreGiro) {
        Cuenta_corriente cuentaCorriente = new Cuenta_corriente(nombreTitular, apellido, numeroCuenta, SobreGiro);
        Banco.agregarCuenta(cuentaCorriente);

    }

    public static void crearCuenta_corriente(String nombre, String apellido, String numeroCuenta, int info) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCuenta_corriente'");
    }
}
  
