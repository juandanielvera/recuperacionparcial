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
    public String obtenerListaCuentas() {
        String listaCuentasArea = "";
        for (Cuenta_bancaria cuenta : Banco.getListaCuentaBancarias()) {
            listaCuentasArea = lista_Cuentas_Bancarias + "Nombre Titular: " + cuenta.getNombreTitular() + "Apellido Titular: "
                    + cuenta.getApellidosTitular() + " Numero Cuenta: " + cuenta.getNumeroCuenta()
                    + " Saldo de la cuenta: " + cuenta.getSaldo() + "\n";

        }
        return listaCuentasArea;
    }}

   





    
    

    
    


