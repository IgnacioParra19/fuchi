import org.junit.Test;
import static org.junit.Assert.*;

import ucp.fuol.com.*;
import ucp.fuol.com.Interfaces.*;;

public class PantallasLedTest {
    @Test
    public void pantallas_estadio_parcial_ejercicio_ejemplo_10() {
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        jugadorBoca6.setPosicion("Defensor");

        Equipo boca = new Equipo("Boca Juniors", "BOC");

        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");

        PantallaLed pantallaLed = new PantallaLed();

        assertEquals("[Jugador 6] Marcos Rojo > Defensor", pantallaLed.imprimir((IImprimible)jugadorBoca6));
        assertEquals("[Equipo] Boca Juniors > BOC", pantallaLed.imprimir(boca));
        assertEquals("[Estadio] La Bombonera (Buenos Aires - Argentina)", pantallaLed.imprimir(estadioBombonera));
    }
}
