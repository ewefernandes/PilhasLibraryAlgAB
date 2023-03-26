package controller;
import br.edu.fateczl.pilhaint.*;

public class AlgoritmosAB {
	public AlgoritmosAB() {
		super();
	}
	
	public void PilhaPar() {
		Pilha pilha = new Pilha();
		for (int i = 0; i < 10; i ++) {
			if (i % 2 == 0) {
				pilha.push(i * i);
			} else {
				if (i <= 5) {
					pilha.push(i);
				} else {
					try {
						pilha.pop();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		System.out.println("Pilha 1: ");
		try {
			System.out.println("Topo = " +pilha.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Tamanho = " +pilha.size());
	}
	
	public void pilhaCem() {
		Pilha pilhaB = new Pilha();
		
		for (int i = 100; i < 115; i ++) {
			if (pilhaB.isEmpty()) {
				pilhaB.push(i + 100);
			} else {
				if (pilhaB.size() <= 4) {
					pilhaB.push(i + 50);
				} else {
					try {
						pilhaB.pop();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		System.out.println("Pilha 2: ");
		try {
			System.out.println("Topo = " +pilhaB.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Tamanho = " +pilhaB.size());		
		
	}
	
}
