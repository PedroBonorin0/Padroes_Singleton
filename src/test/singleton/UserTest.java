package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

  @Test
  void getNome() {
    User.getUser().setNome("Pedro Bonorino");
    assertEquals("Pedro Bonorino", User.getUser().getNome());
  }

  @Test
  void contarVendas() {
    Venda.criaVenda(2);
    assertEquals("Total de vendas: 2", User.getUser().contarVendas());
    Venda.criaVenda(3);
    assertEquals("Total de vendas: 5", User.getUser().contarVendas());
  }
}