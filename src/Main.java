
import factory.ImpostoFactory;
import factory.TipoImposto;
import imposto.Imposto;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Item> itens = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setCodigo(1);
        produto1.setDescricao("Milho em lata");
        produto1.setValor(100);
        produto1.setIndustrial(true);

        Imposto impostoICMS = ImpostoFactory.getImposto(TipoImposto.TIPOICMS);
        produto1.setImpostoCalculado(impostoICMS.calcular(produto1));
        produto1.setTotal(produto1.getValor() + produto1.getImpostoCalculado());
        itens.add(produto1);


        Produto produto2 = new Produto();
        produto2.setCodigo(2);
        produto2.setDescricao("Feijão Bombom");
        produto2.setValor(200);
        produto2.setIndustrial(true);

        Imposto impostoIPI = ImpostoFactory.getImposto(TipoImposto.TIPOIPI);
        produto2.setImpostoCalculado(impostoIPI.calcular(produto2));
        produto2.setTotal(produto2.getValor() + produto2.getImpostoCalculado());
        itens.add(produto2);


        Servico servico = new Servico();
        servico.setCodigo(3);
        servico.setDescricao("Consultoria");
        servico.setValor(500);

        Imposto impostoISS = ImpostoFactory.getImposto(TipoImposto.TIPOISS);
        servico.setImpostoCalculado(impostoISS.calcular(servico));
        servico.setTotal(servico.getValor() + servico.getImpostoCalculado());
        itens.add(servico);


        double totalGeral = 0;
        double totalImpostos = 0;
        for (Item item : itens) {
            System.out.println("Item: " + item.getDescricao() + " | Valor: " + item.getValor() +
                    " | Imposto: " + item.getImpostoCalculado() + " | Total: " + item.getTotal());
            totalGeral += item.getTotal();
            totalImpostos += item.getImpostoCalculado();
        }

        System.out.println("Valor Total dos Itens: " + totalGeral);
        System.out.println("Valor Total dos Impostos: " + totalImpostos);
    }
}
