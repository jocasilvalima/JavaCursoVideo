package controller;

import util.Teclado;

public class AptoVotar {

	public static void main(String[] args) {
		int ano = Teclado.lerInt("Digite sua idade:");

		int ver = 2023 - ano;

		if (ver < 16) {
			System.out.println("Você tem: " + ver + " anos e não pode votar.");
		} else {
			if ((ver > 15 && ver < 18) || (ver > 70)) {
				System.out.println("Você tem: " + ver +" anos seu voto é opcional.");
			} else {
				System.out.println("Você tem: " + ver +" anos seu voto é  obrigatorio.");

			}
		}
	}
}
