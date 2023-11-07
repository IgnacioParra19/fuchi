package ucp.fuol.com;

import ucp.fuol.com.Interfaces.IImprimible;

public class PantallaLed {

    public String imprimir(IImprimible pImprimible) {
        return pImprimible.impresion();
    }
}
