package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar;


public class Principal {

	public static void main(String[] args) {
		ArvoreChar a = new ArvoreChar();
		char [] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		for (char i: vetor) {
			a.insert(i);
		}
		try {
			a.remove('f');
			a.remove('u');
			a.prefixSearch();
			a.infixSearch();
			a.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
