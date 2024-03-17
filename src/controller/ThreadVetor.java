package controller;

public class ThreadVetor extends Thread {

	private int[] vet;
	private int num;

	public ThreadVetor(int[] vet, int num) {
		this.vet = vet;
		this.num = num;
	}

	@Override
	public void run() {
		contaTempo();
	}

	private void contaTempo() {
		switch (num) {
		case 1:
			double tempoInicialFor = System.nanoTime();		
			for (int i = 0; i < vet.length; i++) {
				
			}
			double tempoFinalFor = System.nanoTime();
			double tempoTotalFor = (tempoFinalFor - tempoInicialFor) / Math.pow(10, 9);
			System.out.println("Tempo para percorrer com for: " + tempoTotalFor + " s.");
			break;

		case 2:
			double tempoInicialForeach = System.nanoTime();	
			for (@SuppressWarnings("unused") double tempo : vet) {
				
			}
			double tempoFinalForeach = System.nanoTime();
			double tempoTotalForeach = (tempoFinalForeach - tempoInicialForeach) / Math.pow(10, 9);
			System.out.println("Tempo para percorrer com foreach: " + tempoTotalForeach + " s.");
			break;
		}
	}

}
