package services;

import java.util.ArrayList;
import java.util.List;

//Aqui voc� pode colocar a letra que voc� quiser, estou colocando "T" com significado de "Type"
public class PrintService<T>{

	/* O generics aceita apenas o tipo que for parametrizado pelo programador, se voc� definir que 
	 * a lista s� ir� aceitar o tipo int, ela n�o ir� aceitar outros tipos, mas para que?:
	 * Para ter o reuso da l�gica, causo voc� queira trocar o tipo sem ter que alterar a l�gica
	 * do PrintService e quer que o programa n�o aceite outros tipos al�m do que foi parametrizado,
	 * tendo um type safety (seguran�a de tipo).
	 */
	List<T> ps = new ArrayList<>();

	public void addValue(T value) {
		ps.add(value);
	}

	public T first() {
		// Se a lista est� vazia ele ir� lan�ar uma exce��o
		if (ps.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return ps.get(0);
	}

	public void print() {
		System.out.print("[");
		// Apenas retorne se n�o estiver v�zia
		if (!ps.isEmpty()) {
			System.out.print(ps.get(0));
		}
		for (int cont = 1; cont < ps.size(); cont++) {
			System.out.print(", " + ps.get(cont));
		}
		System.out.println("]");
	}
}