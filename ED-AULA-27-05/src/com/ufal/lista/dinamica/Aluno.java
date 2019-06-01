package com.ufal.lista.dinamica;


public class Aluno {
	//dados
	private String nome;
	private double nota;
	//ponteiro
	private Aluno proximo;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
		this.proximo = null;
	}
	
	public Aluno getProximo() {
		return proximo;
	}
	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}
	
	public String getNome() {
		return nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

}
