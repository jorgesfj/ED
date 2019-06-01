package com.ufal.lista.estatica;

import com.ufal.ILista;
import com.ufal.lista.dinamica.Aluno;

public class ListaEstatica implements ILista{
	
	private Aluno[] alunoLista;
	private int tamanho;
	private int tamanhomax;
	
	public ListaEstatica(int tamanhoMaximo) {
		this.alunoLista = new Aluno[tamanhoMaximo];
		this.tamanho = 0;
		this.tamanhomax = tamanhoMaximo;
	}
	
	@Override
	public void inserirInicio(Aluno aluno) {
		if(estaCheia()) {
			System.out.println("A Lista está cheia, não da pra adicionar mais itens.");
		}else {
			for(int i = tamanho; i>0;i--) {
				this.alunoLista[i+1] = this.alunoLista[i];
			}
			this.tamanho += 1;
			this.alunoLista[1] = aluno;
		}	
	}
	

	@Override
	public void inserirFim(Aluno aluno) {
		if(estaCheia()){
		}else {
		alunoLista[tamanho+1] = aluno;
		}	
		this.tamanho+=1;
	}

	@Override
	public void imprimir() {
		for(int i=1;i<=tamanho;i++) {
			System.out.println(alunoLista[i].getNome());
		}
		System.out.println("FIM DA LISTA!!");
		
	}

	@Override
	public boolean estaVazia() {
		if(tamanho == 0) {
		return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean estaCheia() {
		if(this.tamanho == this.tamanhomax) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public Aluno buscarAluno(int ordem) {
		return alunoLista[ordem];
	}

	@Override
	public Aluno buscarAluno(String nome) {
		Aluno aux = null;
		for(int i = 1; i<=tamanho;i++) {
			if(alunoLista[i].getNome() == nome) {
				aux = alunoLista[i];
			}
		}if(aux == null) {
			System.out.println("Não existe um aluno com esse nome.");
			return null;
		}else {
			return aux;
		}
		
	}

	@Override
	public void retirarElemento(int ordem) {
		int cont = ordem;
		alunoLista[ordem] = null;
		while(cont<tamanho) {
			alunoLista[cont] = alunoLista[cont+1];
			cont+=1;
		}
		this.tamanho -=1;
		
		
	}

	@Override
	public void esvaziar() {
		this.alunoLista = null;
		this.tamanho = 0;
		}
}
