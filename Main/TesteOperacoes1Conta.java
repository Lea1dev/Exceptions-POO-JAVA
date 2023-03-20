package Main;
import Contas.*;

class TesteOperacoes1Conta{
public static void main(String[] args) {

    ManipuladorDeContas caixa = new ManipuladorDeContas();
    Conta conta = null;

    int opcao = -1;
    while (opcao != 0){
        opcao = caixa.menu();

        switch (opcao) {
            case 1:
                conta = caixa.criaConta();
                break;
            case 2:
                caixa.deposita(conta);
                break;
            case 3:
                caixa.sacar(conta);
                break;
            case 4:
                caixa.saldo(conta);
                break;             
            default:
                System.out.println("Opcao Invalida");
                break;
        }    
    }
  }
}