package com.example.semoc.itens;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens")
public class Item implements Comparable<Item> {
	String titulo;
	String tipo;
	public Item(String tipo,String titulo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
	}
	
	@Override
	public int hashCode() {
		return (tipo.hashCode()+titulo.hashCode());
	}
	
	@Override
	public boolean equals(Object obj) {
		Item outro = (Item) obj;
		return (outro.tipo.equals(this.tipo) 
				&& outro.titulo.equals(this.titulo));
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [titulo=").append(titulo).append(", tipo=").append(tipo).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Item o) {
		int r = this.tipo.compareTo(o.tipo);
		if(r == 0 ) {
			r = this.titulo.compareTo(this.titulo);
		}
		return this.titulo.compareTo(this.titulo);
	}
}