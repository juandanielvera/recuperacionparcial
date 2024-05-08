/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
    @SuppressWarnings("static-access")
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        
        Banco Davivienda = new Banco("Davivienda");
        Cuenta_ahorros cuenta_1 = new Cuenta_ahorros("juan daniel", "vera", "04832564888", 0.001);
        Cuenta_corriente cuenta_2 = new Cuenta_corriente("juan daniel", "vera", "03456659889", 500000);

        Davivienda.agregarCuenta(cuenta_2);
        Davivienda.agregarCuenta(cuenta_1);
       
       System.out.println(cuenta_2.consultarSaldo());
       System.out.println(cuenta_1.consultarSaldo());
        cuenta_2.depositar(500000);
        cuenta_1.depositar(5000000);
        System.out.println(cuenta_2.consultarSaldo());
         System.out.println(cuenta_1.consultarSaldo());
        Transaccion transaccion_1 = new Transaccion("478874", 200000, LocalDate.now(), "compras marketplace",  Tipo_movimiento.DEPOSITO);
        cuenta_2.agregarTransaccion(transaccion_1);
         

        
        cuenta_2.retirar(100000);
        cuenta_1.retirar(2500000);
      
        System.out.println(cuenta_2.consultarSaldo());
         System.out.println(cuenta_1.consultarSaldo());
        transaccion_1.transferirOtraCuenta("03498896556","055048847997",300000);
        System.out.println(cuenta_2.consultarSaldo());
        System.out.println(cuenta_1.consultarSaldo());

        
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    @SuppressWarnings("static-access")
    @Test
    public void DepositarValorNegativo() {
        LOG.info("Inicio test DepositarValorNegativo ");
        Banco Davivienda = new Banco("Davivienda");
        Cuenta_ahorros cuenta_1 = new Cuenta_ahorros("juan daniel", "vera", "04832564888", 0.001);
        Cuenta_corriente cuenta_2 = new Cuenta_corriente("juan daniel", "vera", "03456659889", 500000);
        Davivienda.agregarCuenta(cuenta_2);
        Davivienda.agregarCuenta(cuenta_1);

        assertThrows(Throwable.class , ()-> cuenta_1.depositar(-50000));
        assertThrows(Throwable.class , ()-> cuenta_2.depositar(-50000));


        LOG.info("Final test DepositarValorNegativo ");
    }

    @SuppressWarnings("static-access")
    @Test
    public void RetirarValorNegativo() {
        LOG.info("Inicio test RetirarValorNegativo ");
        Banco Davivienda = new Banco("Davivienda");
        Cuenta_ahorros cuenta_1 = new Cuenta_ahorros("juan daniel", "vera", "04832564888", 0.001);
        Cuenta_corriente cuenta_2 = new Cuenta_corriente("juan daniel", "vera", "03456659889", 500000);
        Davivienda.agregarCuenta(cuenta_2);
        Davivienda.agregarCuenta(cuenta_1);

        assertThrows(Throwable.class , ()-> cuenta_1.retirar(-50000));
        assertThrows(Throwable.class , ()-> cuenta_2.retirar(-50000));
        LOG.info("Final test RetirarValorNegativo ");
    }
    @SuppressWarnings("static-access")
    @Test
    public void tranferirValorNegativo() {
        LOG.info("Inicio test tranferirValorNegativo ");
        LOG.info("Inicio test testRetirarValorNegativo ");
        Banco Davivienda = new Banco("Davivienda");
        Cuenta_ahorros cuenta_1 = new Cuenta_ahorros("juan daniel", "vera", "04832564888", 0.001);
        Cuenta_corriente cuenta_2 = new Cuenta_corriente("juan daniel", "vera", "03456659889", 500000);
        Davivienda.agregarCuenta(cuenta_2);
        Davivienda.agregarCuenta(cuenta_1);
        Transaccion transaccion_1 = new Transaccion("478874", 200000, LocalDate.now(), "compras marketplace",  Tipo_movimiento.DEPOSITO);
        assertThrows(Throwable.class , ()-> transaccion_1.transferirOtraCuenta("03498896556","055048847997",-200000));
        
        LOG.info("Final test tranferirValorNegativo ");
    }

    
}