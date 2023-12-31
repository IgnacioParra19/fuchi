import static org.junit.Assert.*;

import org.junit.Test;

import ucp.fuol.com.Equipo;
import ucp.fuol.com.Estadio;
import ucp.fuol.com.Partido;

public class EstadioTest {
    @Test
    public void estadio_se_debe_crear_en_una_ubicacion_parcial_ejercicio_ejemplo_05() {
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");

        assertEquals("La Bombonera", estadioBombonera.getName());
        assertEquals("Buenos Aires", estadioBombonera.getCiudad());
        assertEquals("Argentina", estadioBombonera.getPais());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", estadioBombonera.toString());

    }

    @Test
    public void un_partido_debe_disputarse_en_un_estadio_en_una_fecha_parcial_ejercicio_ejemplo_06() {
        Equipo boca = new Equipo("Boca Juniors", "BOC");
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");

        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");

        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");

        assertEquals("La Bombonera", estadioBombonera.getName());
        assertEquals("Buenos Aires", estadioBombonera.getCiudad());
        assertEquals("Argentina", estadioBombonera.getPais());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", estadioBombonera.toString());

        assertEquals("Semifinal Partido Vuelta BOCxPAL", partido.getName());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", partido.getEstadio().toString());

    }

}
