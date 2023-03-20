package Contas;

public abstract class Conta {

  private int numero;
  private String titular ; 
  private double saldo ; 
  private double limite;

  public Conta(String nomeTitular){
    this.setTitular(nomeTitular);
  }

  public Conta(String nomeTitular, int noConta){
    this.setTitular(nomeTitular);
    this.numero = noConta;
  }

  public double getSaldo(){
    return this.saldo + this.limite;
  }

  public String getTitular() {
    return this.titular;   
  }
  
  public void setTitular(String titular) {
    this.titular = titular;            
  }

  public void deposita(double valor) {
    if (valor > 0)
      this.saldo += valor;
    else if(valor < 0)
    	throw new IllegalArgumentException("O valor a ser depositado não pode ser negativo."); 
  }

  public boolean saca(double valor){
    if (this.saldo + this.limite < valor) {
      return false;
    }
    else {
      this.saldo = this.saldo - valor;
      return true;
    }
  }

  public boolean transfere(Conta destino, double valor){
    boolean retirou = this.saca(valor);
    if (retirou == false) { 
        return false;
    }
    else {
        destino.deposita(valor);
        return true;
    }
  }

  @Override
  public String toString(){
    String resultado = "Conta: [";
    resultado += "No da conta: "+numero;
    resultado += "\ntitular: "+getTitular();
    resultado += "\nSaldo: "+getSaldo();
    resultado += "\nlimite: "+limite;
    resultado += "]";

    return resultado+"\n";
  }  
}