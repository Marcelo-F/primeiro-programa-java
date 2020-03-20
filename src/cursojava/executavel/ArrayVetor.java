package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;


public class ArrayVetor {

	public static void main(String[] args) {
		double[] notas = { 8.8, 7.7, 7.6, 6.8 };
		double[] notasLogica = { 9.2, 6.1, 4.6, 8.2 };

		Aluno aluno = new Aluno();
		aluno.setNome("Marcelo");
		aluno.setNomeEscola("Jdev treinamento");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("lógica de programação");
		disciplina2.setNota(notasLogica);
	
		//-------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int pos =0;  pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d: arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da discplina é: " + d.getDisciplina());
			for(int posnota =0; posnota < d.getNota().length; posnota ++) {
				System.out.println("A nota numero: " +(posnota+1) + " é igual =" + d.getNota()[posnota] );
				
			}
			System.out.println("Média do aluno é: " + aluno.getMediaNota());
			System.out.println("Aluno esta: " + aluno.getAlunoAprovado2());
			//System.out.println("Aluno esta: " + aluno.getAlunoAprovado());
			
			}
			
		}
		
		
	}

}
