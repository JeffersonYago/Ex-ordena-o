package main;

import javax.swing.JOptionPane;

import controller.SortsController;

public class Principal {

	public static void main(String[] args) {
		SortsController srts = new SortsController();
		int[] vetex1 = {74,20,74,87,71,16,25,99,44,58};
		int[] vetex2 = {44,43,42,41,40,39,38};
		int tamanhovet1 = vetex1.length;
		int tamanhovet2 = vetex2.length;
		int select = 0;
		while(select != 9) {
			select = Integer.parseInt(JOptionPane.showInputDialog("1 - Resolucao Bubble \n 2 - Resolucao Merge"));
			switch(select) {
			case 1: srts.bubble(vetex1); srts.bubble(vetex2);
					break;
			case 2: srts.merge(vetex1,tamanhovet1-1); srts.merge(vetex2,tamanhovet2-1);
					break;
			}
	}
	}
}
