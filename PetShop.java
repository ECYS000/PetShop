package PetShop;

import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bem-vindo nosso loja Pet Shop");
		System.out.println("Gostaria usar nosso serviço Pet Shop? \n"
				+ "1 - Sim \n"
				+ "2 - Não");
		int simOuNao = entrada.nextInt();
	if (simOuNao == 1) {
		Cachorro cliente1 = new Cachorro();
		PrecoPetShop custos = new PrecoPetShop();
		
		System.out.println("Qual é seu nome?");
		cliente1.nome = entrada.next();
		
		System.out.println("Informa o nome seu cachorro?");
		cliente1.nomeCachorro = entrada.next();	
		
		
		System.out.println("Qual é raça de "+cliente1.nomeCachorro+"?");
		cliente1.racaCachorro = entrada.next();	
		
		
		System.out.println("Informa o sexo "+cliente1.nomeCachorro+"?");
		cliente1.sexoCachorro = entrada.next();
		
		
		System.out.println("e idade?");
		cliente1.idadeCachorro = entrada.nextInt();	
		
		
		System.out.println("Prezado(a) "+cliente1.nome+" \n"
				+ "Nome de Cachorro: "+cliente1.nomeCachorro+" \n"
				+ "Raça: "+cliente1.racaCachorro+" \n"
				+ "Sexo: "+cliente1.sexoCachorro+" \n"
				+ "Idade: "+cliente1.idadeCachorro+" anos \n\n"
				+ "Qual serviço que você gostaria para "+cliente1.nomeCachorro+"? \n"
				+ "1 - Banho = "+custos.banho+" reais \n"
				+ "2 - Tosa = "+custos.banhoTosa+" reais \n"
				+ "3 - Banho + Tosa = "+custos.tosa+" reais");
		int qualServico = entrada.nextInt();
		String resposta = custos.servico(qualServico);
		System.out.println(resposta);
		entrada.close();
		
	} else if (simOuNao == 2) {
		System.out.println("Muito obrigado, volte sempre!");
	} else {
		System.out.println("Inválido, por favor inserir apenas o número 1 ou 2!");
	}
		
		
		
		
		
		
		
		
		
		
	}
}
