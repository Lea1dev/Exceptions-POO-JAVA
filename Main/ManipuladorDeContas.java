package Main;

import java.util.Scanner;
import Contas.*;

class ManipuladorDeContas{
    public int menu(){
        System.out.println("\n1) criar uma conta");
        System.out.println("2) depositar");
        System.out.println("3) sacar");
        System.out.println("4) mostrar o saldo.");
        System.out.println("0) sair.");      

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua opção: ");
        int opcao = entrada.nextInt();
        
        return opcao;
    }

    public Conta criaConta(){
      Scanner entrada = new Scanner(System.in);

      System.out.print("Digite o tipo da Conta que deseja criar. \n'c' para Corrente ou 'p' para Poupanca");
      String tipoConta = entrada.nextLine();

      System.out.print("Digite o titular");
      String titular = entrada.nextLine();
      System.out.print("Digite o Numero da Conta");
      int numero = entrada.nextInt();
      
      Conta c1 = null;
      if (tipoConta.equals("c"))
        c1 = new ContaCorrente(titular, numero);
      else if (tipoConta.equals("p"))
        c1 = new ContaPoupanca(titular, numero);

      this.deposita(c1);
      
      return c1;
    }

    public void deposita(Conta contaParaDeposito){
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Digite o valor do deposito");
      double valor = entrada.nextDouble();
      contaParaDeposito.deposita(valor);
      
      
    }

    public void sacar(Conta contaParaSaque){
      Scanner entrada = new Scanner(System.in);

      System.out.print("Digite o valor do saque");
      double valor = entrada.nextDouble();


      boolean resultado = contaParaSaque.saca(valor);
      if (resultado)
        System.out.println("saque com sucesso");
      else
        System.out.println("erro ao sacar!");
      
      
    }

  public void saldo(Conta conta){
    double saldo = conta.getSaldo();
    System.out.println("Saldo da conta: "+ saldo);
  }
}