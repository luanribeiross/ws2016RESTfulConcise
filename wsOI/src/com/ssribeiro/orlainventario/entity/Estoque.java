package com.ssribeiro.orlainventario.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the estoque database table.
 * 
 */
@Entity
@NamedQuery(name="Estoque.findAll", query="SELECT e FROM Estoque e")
public class Estoque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int id;

	private int atual;

	private String contagem;

	private int max;

	private int min;

	//bi-directional one-to-one association to Item
	@OneToOne(mappedBy="estoque")
	private Item item;

	public Estoque() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAtual() {
		return this.atual;
	}

	public void setAtual(int atual) {
		this.atual = atual;
	}

	public String getContagem() {
		return this.contagem;
	}

	public void setContagem(String contagem) {
		this.contagem = contagem;
	}

	public int getMax() {
		return this.max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return this.min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}