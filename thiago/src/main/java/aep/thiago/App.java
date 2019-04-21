package aep.thiago;

public class App 
{
    public static void main( String[] args )
    {
    	Aluno thiago = new Aluno(1, "Thiago");

    	
    	Disciplina algoritmos = new Disciplina("Algoritmos");
    	
    	
    	Avaliacao avaliacao1 = new Avaliacao(thiago, algoritmos, 10.0f);
    	
    	
    	RepositorioDeAvaliacoes repo = new RepositorioDeAvaliacoes();
    	repo.adiconar(avaliacao1);
    	
    	
    	Aluno[] aprovadosEmAlgoritmos = repo.obterAprovados(algoritmos);
    	
    	
    }
}
