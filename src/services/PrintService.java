package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	/* Object aceita valores de todos os tipos, podendo ser perigoso, se seu
	 * programa apenas pode aceitar valores tipo int
	 */
	List<Object> ps = new ArrayList<>();

	public void addValue(Object value) {
		ps.add(value);
	}

	public Object first() {
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