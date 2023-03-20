package Main;

import Contas.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    ManipuladorDeContas caixa = new ManipuladorDeContas();

    Conta conta1 = caixa.criaConta();

    caixa.deposita(conta1);
    caixa.sacar(conta1);
    caixa.saldo(conta1);

    ContaCorrente cc1 = new ContaCorrente("ricardo",123);
    ContaCorrente cc2 = new ContaCorrente("joao",122);
    ContaCorrente cc3 = new ContaCorrente("xxx",121);

    cc1.deposita(1000);
    cc2.deposita(1001);
    cc3.deposita(1002);

    Agencia ag33 = new Agencia();

    ag33.adicionarConta(cc1);
    ag33.adicionarConta(cc2);
    ag33.adicionarConta(cc3);

    //ag33.mostraTudo();
    System.out.println(ag33);
  }
}