package aep.thiago;

public class Aluno {
	private String nome;
	private int ra;

public Aluno(int ra, String nome) {
	this.nome = nome;
	this.ra = ra;
	
}

// METODO DE RETORNO DO NOME
public String getNome() {
	return nome;
}

// METODO DE RETORNO DO RA
public int getRA() {
	return ra;
}
}
