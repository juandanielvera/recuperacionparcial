package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public class Banco {
    private final String nombre;
    private  static Collection<Cuenta_bancaria> lista_Cuentas_Bancarias;

    public Banco(String nombre) {
        this.nombre = nombre;
        Banco.lista_Cuentas_Bancarias = new LinkedList<Cuenta_bancaria>();
    }

    public String getNombre() {
        return nombre;
    }

    public static Collection<Cuenta_bancaria> getListaCuentaBancarias() {
        return lista_Cuentas_Bancarias;
    }

    public void setListaCuentaBancarias(Collection<Cuenta_bancaria> listaCuentaBancarias) {
        Banco.lista_Cuentas_Bancarias = listaCuentaBancarias;
    }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", listaCuentaBancarias=" + lista_Cuentas_Bancarias + "]";
    }
    public  void crearBanco(String nombre){
        new Banco(nombre);
        System.out.println("banco creado");
    }
    public static void agregarCuenta(Cuenta_bancaria cuenta) {
        lista_Cuentas_Bancarias.add(cuenta);
    }

    public static void retirar(Cuenta_bancaria cuenta, double cantidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retirar'");
    }

    public static void depositar(Cuenta_bancaria cuenta, double cantidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    public static Cuenta_bancaria[] getListaCuentas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListaCuentas'");
    }
    }






    
    

    
    


