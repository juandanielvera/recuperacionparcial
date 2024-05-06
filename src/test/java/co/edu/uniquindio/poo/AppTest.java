/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");

        Cuenta_ahorros cuenta_1 = new Cuenta_ahorros("Manuel", "Pineda", "1092455543", 0.001);
        Cuenta_corriente cuenta_2 = new Cuenta_corriente("Laura", "Urrea", "1094891731", 50000);

        co.edu.uniquindio.poo.Banco.agregarCuenta(cuenta_2);
        co.edu.uniquindio.poo.Banco.agregarCuenta(cuenta_1);


        cuenta_2.depositar(20000);
        Transaccion transaccion_1 = new Transaccion("676976", 200000, LocalDate.now(), "compras marketplace",  Tipo_movimiento.DEPOSITO);
        cuenta_2.agregarTransaccion(transaccion_1);
        System.out.println("Saldo despues del deposito: "+cuenta_2.getSaldo());
        cuenta_2.retirar(80000);
        System.out.println("Saldo despues del retiro: "+cuenta_2.getSaldo());
        System.out.println("Saldo del sobregiro despues del retiro: "+cuenta_2.getSobreGiro());

        cuenta_1.depositar(50000);
        System.out.println("Saldo despues del deposito: "+cuenta_1.getSaldo());
        cuenta_1.retirar(10000);
        System.out.println("Saldo despues del retiro: "+cuenta_1.getSaldo());


        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}