package controller;

import bubbleSort.Biblioteca.BubbleSort;
import mergeSort.Biblioteca.MergeSort;

public class SortsController {
	BubbleSort bsort = new BubbleSort();
	MergeSort msort = new MergeSort();
	public SortsController() {
		super();
	}
	public int[] bubble(int[] vet) {
		int tamanho = vet.length;
		System.out.print("vetor original: [");
		for(int i = 0; i <tamanho; i++) {
			System.out.print(" "+vet[i]+ " ");
		}
		System.out.print("]");
		System.out.println("");
		vet = bsort.bubble_sort(vet);
		System.out.print("vetor BubbleSort: [");
		for(int j = 0; j <tamanho; j++) {
			System.out.print(" "+vet[j]+ " ");
		}
		System.out.print("]");
		System.out.println("");
		return vet;
	}

	public int[] merge(int[] vet, int fim) {
		int tamanho = vet.length;
		System.out.print("vetor original: [");
		for(int i = 0; i <tamanho; i++) {
			System.out.print(" "+vet[i]+ " ");
		}
		System.out.print("]");
		System.out.println("");
		
		vet = msort.MergeSorting(vet, 0, fim);
		System.out.print("vetor MergeSort: [");
		for(int j = 0; j <tamanho; j++) {
			System.out.print(" "+vet[j]+ " ");
		}
		System.out.print("]");
		System.out.println("");
		return vet;
	}

}
