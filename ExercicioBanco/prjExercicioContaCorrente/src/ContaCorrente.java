/**
 *
 * @author Gabriel Rodrigues
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numConta, double saldoConta){
        numero = numConta;
        saldo = saldoConta;
    }
    
    public int getNumero(){
        return(numero);
    }
    
    public double getSaldo(){
        return(saldo);
    }
    
    public void Sacar(double saque){
        saldo = saldo - saque;
    }
    
    public void Depositar(double deposito){
        saldo = saldo + deposito;
    }
}
