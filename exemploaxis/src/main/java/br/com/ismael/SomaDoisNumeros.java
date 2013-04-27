package br.com.ismael;

import javax.jws.WebService;

@WebService
public class SomaDoisNumeros {
	public int somaDoisNumeros(int num1, int num2) {
		return EfetuaSoma.soma(num1, num2);
		// return num1 + num2;
	}
}
