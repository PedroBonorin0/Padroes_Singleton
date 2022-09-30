package singleton;

public class Venda {

  private static int totalVendas;

  public static void criaVenda(int numVendas) {
    totalVendas += numVendas;
  }

  public static int getTotalVendas() {
    return totalVendas;
  }
}
