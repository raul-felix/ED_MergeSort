package br.edu.fateczl.mergesort;

public class MergeSort {
	
	public MergeSort() {
		super();
	}
	
	public int[] sort(int[] vet, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			sort(vet, inicio, meio);
			sort(vet, meio + 1, fim);
			intercala(vet, inicio, meio, fim);
		}
		return vet;
	}
	
	private void intercala(int[] vet, int inicio, int meio, int fim) {
		int[] aux = new int[vet.length];
		int ponteiroEsquerda = inicio;
		int ponteiroDireita = meio + 1;
		
		for (int i = inicio; i <= fim; i++) {
			aux[i] = vet[i];
		}
		
		for (int i = inicio; i <= fim; i++) {
			if (ponteiroEsquerda > meio) {
				vet[i] = aux[ponteiroDireita];
				ponteiroDireita++;
			} else if (ponteiroDireita > fim) {
				vet[i] = aux[ponteiroEsquerda];
				ponteiroEsquerda++;
			} else if (aux[ponteiroEsquerda] < aux[ponteiroDireita]) {
				vet[i] = aux[ponteiroEsquerda];
				ponteiroEsquerda++;
			} else {
				vet[i] = aux[ponteiroDireita];
				ponteiroDireita++;
			}
		}
	}
}
