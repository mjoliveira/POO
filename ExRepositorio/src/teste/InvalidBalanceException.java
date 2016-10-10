package teste;
//a) Considerando que o saldo nunca pode ser negativo, crie uma nova classe de exceção 'InvalidBalanceException'.

@SuppressWarnings("serial")
public class InvalidBalanceException extends Exception {

	public InvalidBalanceException(){
        super("O saldo não pode ser negativo.");
    }
    
}
