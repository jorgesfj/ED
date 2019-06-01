package com.ufal.lista.dinamica;

import com.ufal.ILista;

public class ListaDinamica implements ILista{
	
	private Aluno primeiroAluno;
	
	
	public ListaDinamica() {
		this.primeiroAluno = null;
	}

	@Override
	public void inserirInicio(Aluno aluno) {
		if(primeiroAluno == null) {
			this.primeiroAluno = aluno;
		}else {
			aluno.setProximo(this.primeiroAluno);
			this.primeiroAluno = aluno;
		}
		
	}

	@Override
	public void inserirFim(Aluno aluno) {
		Aluno aux = this.primeiroAluno;
		while(aux.getProximo()!=null) {
			aux = aux.getProximo();
		}
		
		aux.setProximo(aluno);
		
	}

	@Override
	public void imprimir() {
		Aluno aux = this.primeiroAluno;
		while(aux!=null) {
			System.out.println(aux.getNome() + " ==== " + aux.getNota());
			aux = aux.getProximo();
		}
		System.out.println("FIM DA LISTA");
	}

	@Override
	public boolean estaVazia() {
		if(this.primeiroAluno == null) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean estaCheia() {
		return false;
	}

	@Override
	public Aluno buscarAluno(int ordem) {
		ordem -=1;
		int cont = 0;
		Aluno aux = this.primeiroAluno;
		while(cont<ordem) {
			cont += 1;
			aux = aux.getProximo();
		}
		return aux;
	}

	@Override
	public Aluno buscarAluno(String nome) {
		Aluno aux = this.primeiroAluno;
		while(nome!=aux.getNome()) {
			aux = aux.getProximo();
		}
		return aux;
	}

	@Override
	public void retirarElemento(int ordem) {

		
	}

	@Override
	public void esvaziar() {		
	}

}
