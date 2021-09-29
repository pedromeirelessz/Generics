package services;

import java.util.ArrayList;
import java.util.List;

//Aqui você pode colocar a letra que você quiser, estou colocando "T" com significado de "Type"
public class PrintService<T>{

	/* O generics aceita apenas o tipo que for parametrizado pelo programador, se você definir que 
	 * a lista só irá aceitar o tipo int, ela não irá aceitar outros tipos, mas para que?:
	 * Para ter o reuso da lógica, causo você queira trocar o tipo sem ter que alterar a lógica
	 * do PrintService e quer que o programa não aceite outros tipos além do que foi parametrizado,
	 * tendo um type safety (segurança de tipo).
	 */
	List<T> ps = new ArrayList<>();

	public void addValue(T value) {
		ps.add(value);
	}

	public T first() {
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