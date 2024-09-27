package imposto;

import model.Item;
import model.Produto;

public class IPI implements Imposto {
    private static final double ALIQUOTA = 0.12;

    @Override
    public double calcular(Item item) {
        if (item instanceof Produto && ((Produto) item).isIndustrial()) {
            return item.getValor() * ALIQUOTA;
        }
        return 0;
    }
}
