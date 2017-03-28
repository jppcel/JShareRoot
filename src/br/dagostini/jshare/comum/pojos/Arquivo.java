package br.dagostini.jshare.comum.pojos;

import java.io.Serializable;

public class Arquivo implements Serializable {

	private static final long serialVersionUID = 8077295408159335912L;
	
	private String nome;
	private String path;
	private long tamanho;

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome+" - "+tamanho;
	}
}
