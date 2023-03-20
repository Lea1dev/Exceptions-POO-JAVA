package Contas;

public class Agencia{
  private String nome;
  private int numero;

  private ContaCorrente[] contas;
  private int qtdContas;
  private final int MAX_CONTAS = 10;

  public Agencia(){
    contas = new ContaCorrente[MAX_CONTAS];
    qtdContas = 0;
  }

  public void adicionarConta(ContaCorrente conta){
    if (this.qtdContas < MAX_CONTAS){
      int posicao = qtdContas;
      this.contas[posicao] = conta;
      this.qtdContas += 1;
    }
  }

  public void mostraTudo(){
      for (int cont =0 ; cont < this.qtdContas ; cont += 1 ){
        Conta temp = this.contas[cont];
        System.out.println(temp);
      }
  }

  public String toString(){
    String resultado = "";
      for (int cont =0 ; cont < this.qtdContas ; cont += 1 ){
        Conta temp = this.contas[cont];
        resultado += temp + "\n";
      }
      return resultado;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public int getNumero(){
    return this.numero;
  }
}