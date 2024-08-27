import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Gabriel Rodrigues
 */
public class Aplic {
    public static void main(String[] args) {
        int numero, opcao;
        double saldo, saque, deposito;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Informe o número da conta corrente: ");
        numero = entrada.nextInt();
        System.out.print("Informe o saldo da conta corrente: ");
        saldo = entrada.nextDouble();
        ContaCorrente objCorrente = new ContaCorrente(numero, saldo);
        
        do{
             System.out.println("\n1 - Consultar o saldo");
             System.out.println("2 - Realizar saque");
             System.out.println("3 - Realizar depósito");
             System.out.println("4 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();             
             
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("\nConta: " + objCorrente.getNumero() + "\nSaldo: " + df.format(objCorrente.getSaldo()));
                          break;
                 case 2 : System.out.println("\nConta: " + objCorrente.getNumero());
                          System.out.println("\nDigite o valor que deseja sacar: ");
                          saque = entrada.nextDouble();
                          if(saque>saldo)
                              System.out.println("\nSaldo Insuficiente.");
                          else{
                              objCorrente.Sacar(saque);
                              System.out.println("\nConta: " + objCorrente.getNumero() + "\nSaldo atual: " + df.format(objCorrente.getSaldo()));
                          }
                          break;
                 case 3 : System.out.println("\nConta: " + objCorrente.getNumero());
                          System.out.println("\nDigite o valor que deseja depositar: ");
                          deposito = entrada.nextDouble();
                          objCorrente.Depositar(deposito);
                          System.out.println("\nConta: " + objCorrente.getNumero() + "\nSaldo atual: " + df.format(objCorrente.getSaldo()));
                          break;
             }
        }while (opcao < 4);
    }
    
}
