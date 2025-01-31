package factory;

import imposto.*;
import imposto.Imposto;

public class ImpostoFactory {
    public static Imposto getImposto(TipoImposto tipo) {
        switch (tipo) {
            case TIPOICMS: return new ICMS();
            case TIPOPIS: return new PIS();
            case TIPOIPI: return new IPI();
            case TIPOISS: return new ISS();
            default: throw new IllegalArgumentException("Tipo de imposto não exite nessa aplicação.");
        }
    }
}
