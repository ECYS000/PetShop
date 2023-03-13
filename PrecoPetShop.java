package PetShop;

public class PrecoPetShop {
	
	int banho = 50;
	int tosa = 75;
	int banhoTosa = 100;
	
	String servico(int clienteEscolha) {
		
		if (clienteEscolha == 1) {
			return "Seu cachorro vai tomar banho, por favor aguarda!";	
		} else if (clienteEscolha == 2){
			return "Seu cachorro vai tosado, por favor aguarda!";
		} else if (clienteEscolha == 3) {
			return "Seu cachorro vai tomar banho tambem tosado, por favor aguarda!";
		} else {
			return "valor inválido";
		}
	}
}
