package model;

import java.util.*;

public class GenericGraph<T> {

	private ArrayList<Vertex<T>> vertices;

	public void addVertex(T value) {

		vertices.add(new Vertex<T>(value));

	}

	public void addEdge(Vertex<T> from, Vertex<T> to, T value) {

		Edge<T> e1 = new Edge<T>(from, to, value);
		Edge<T> e2 = new Edge<T>(to, from, value);
		from.addEdge(e1);
		to.addEdge(e2);

	}

	public Vertex<T> getVertex(T value) {

		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).getValue().equals(value)) {
				return vertices.get(i);
			}
		}
		return null;

	}

}
