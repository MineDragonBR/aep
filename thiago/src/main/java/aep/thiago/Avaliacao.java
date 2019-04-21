package aep.thiago;

public class Avaliacao {
	private float nota;
	private Aluno aluno;
	private Disciplina disciplina;
	
public Avaliacao(Aluno aluno, Disciplina disciplina, float nota ) {
	this.nota = nota;
	
}
	
// METODO RETORNO NOTA	
public float getNota() {
	return this.nota;
}

// METODO RETORNO DISCIPLINA
public Disciplina getDisciplina() {
	return this.disciplina;
}

// METODO RETORNO ALUNO
public Aluno getAluno() {
	return this.aluno;
}


}
