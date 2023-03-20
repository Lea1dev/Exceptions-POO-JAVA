package Contas;
public class ContaCorrente extends Conta{
  
  public ContaCorrente(String titular, int noConta){
    super(titular,noConta);
  }

  public boolean saca(double valor) {
	  if(valor < 0)
		  throw new IllegalArgumentException("O valor a ser sacado não pode ser negativo.");
	  if(valor > this.getSaldo())
		  throw new SaldoInsuficienteException(valor);
    valor += 0.1;
    return super.saca(valor);
  }
  
}