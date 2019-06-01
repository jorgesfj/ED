package com.ufal;

import com.ufal.lista.dinamica.Aluno;

public interface ILista {
	
	public void inserirInicio(Aluno aluno);
	public void inserirFim(Aluno aluno);
	public void imprimir(); 
	public boolean estaVazia();
	public boolean estaCheia();
	public Aluno buscarAluno(int ordem);
	public Aluno buscarAluno(String nome);
	public void retirarElemento(int ordem);
	public void esvaziar();
}
