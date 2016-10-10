package teste;

public class Aplicacao {

	public static void main(String args[]) {
		
		ContaCorrente conta = null;
		
		try {
			conta = new ContaCorrente(-150);
			
		} catch (InvalidBalanceException e) {
			System.out.println(e.getMessage());
			
		}
	}
}