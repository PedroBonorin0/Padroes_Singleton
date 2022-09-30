package singleton;

public class User {

  private User() {};

  private static User user = new User();
  public static User getUser() { return user; };

  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String contarVendas() {
    return "Total de vendas: " + Venda.getTotalVendas();
  }
}
