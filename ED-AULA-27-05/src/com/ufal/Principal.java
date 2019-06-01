package com.ufal;

import com.ufal.lista.dinamica.Aluno;
import com.ufal.lista.estatica.ListaEstatica;;
public class Principal {
	
	public static void main(String[] args) {
		
		ILista lista = new ListaEstatica(5);
		
		lista.inserirFim(new Aluno("Jorge",10));
		lista.inserirFim(new Aluno("Fabio",2));
		lista.imprimir();
		lista.inserirInicio(new Aluno("Patrick",11));
		lista.imprimir();
		
		System.out.println(lista.buscarAluno("Jorge").getNome());
	}
}
