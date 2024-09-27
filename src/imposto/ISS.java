package imposto;

import model.Item;
import model.Servico;

public class ISS implements Imposto {
    private static final double ALIQUOTA = 0.22;

    @Override
    public double calcular(Item item) {
        if (item instanceof Servico) {
            return item.getValor() * ALIQUOTA;
        }
        return 0;
    }
}
