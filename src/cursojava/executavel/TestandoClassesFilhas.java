package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		 
		Aluno aluno =  new Aluno ();
		aluno.setNome("Alex");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("331232131");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		
		
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		
		System.out.println("Sal�rio do aluno �" + aluno.salario());
		System.out.println("Sal�rio do diretor �" + diretor.salario());
		System.out.println("Sal�rio salario do secret�rio �" + secretario.salario());
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	
		
	}
	
	public static void  teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais= "+pessoa.getNome()+
				" e o salario de" +pessoa.salario());
	}

}
