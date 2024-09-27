package imposto;

import model.Item;
import model.Produto;

public class ICMS implements Imposto {
    private static final double ALIQUOTA = 0.18;

    @Override
    public double calcular(Item item) {
        if (item instanceof Produto) {
            return item.getValor() * ALIQUOTA;
        }
        return 0;
    }
}
