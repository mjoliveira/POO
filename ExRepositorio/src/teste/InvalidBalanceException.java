package teste;
//a) Considerando que o saldo nunca pode ser negativo, crie uma nova classe de exce��o 'InvalidBalanceException'.

@SuppressWarnings("serial")
public class InvalidBalanceException extends Exception {

	public InvalidBalanceException(){
        super("O saldo n�o pode ser negativo.");
    }
    
}
