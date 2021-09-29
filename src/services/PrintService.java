package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	List<Integer> ps = new ArrayList<>();

	public void addValue(Integer value) {
		ps.add(value);
	}

	public Integer first() {
		// Se a lista está vazia ele irá lançar uma exceção
		if (ps.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return ps.get(0);
	}

	public void print() {
		System.out.print("[");
		// Apenas retorne se não estiver vázia
		if (!ps.isEmpty()) {
			System.out.print(ps.get(0));
		}
		for (int cont = 1; cont < ps.size(); cont++) {
			System.out.print(", " + ps.get(cont));
		}
		System.out.println("]");
	}
}