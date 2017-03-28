package br.dagostini.jshare.comum.pojos;

import java.io.Serializable;

public class Arquivo implements Serializable {

	private static final long serialVersionUID = 8077295408159335912L;
	
	private String nome;
	private Diretorio diretorio;
	private long tamanho;
	private String hash;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTamanho() {
		return tamanho;
	}

	public void setTamanho(long tamanho) {
		this.tamanho = tamanho;
	}

	public Diretorio getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(Diretorio diretorio) {
		this.diretorio = diretorio;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome+" - "+tamanho;
	}
}
