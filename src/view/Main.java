package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int vet[] = new int[1000];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) ((Math.random() * 100) + 1);
		}
		
		for (int i = 1; i < 3; i++) {
			ThreadVetor tVet = new ThreadVetor(vet, i);
			tVet.start();
		}
		
	}

}
