
package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.exececao.ExecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.costantes.StatusAluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) throws FileNotFoundException {

		try {

			lerArquivo();

			String login = JOptionPane.showInputDialog("Infomr o login");
			String senha = JOptionPane.showInputDialog("Infomr a senha");

			if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 2; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + qtd + "? ");
					String idade = JOptionPane.showInputDialog("Qual é a idade? ");
					String dataNasc = JOptionPane.showInputDialog("Qual é a data nascimento? ");
					String rg = JOptionPane.showInputDialog("Qual é o numero de RG? ");
					String cpf = JOptionPane.showInputDialog("Qual é o numero do CPF? ");
					String NomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe ? ");
					String NomePai = JOptionPane.showInputDialog("Qual é o nome do pai ?  ");
					String dataMatricula = JOptionPane.showInputDialog("Qual é a data da matrícula? ");
					String NomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola ? ");

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					aluno1.setDataNascimento(dataNasc);
					aluno1.setRegistroGeral(rg);
					aluno1.setNumeroCpf(cpf);
					aluno1.setNomeMae(NomeMae);
					aluno1.setNomePai(NomePai);
					aluno1.setDataMatricula(dataMatricula);
					aluno1.setNomeEscola(NomeEscola);

					/*
					 * Disciplina disciplina1 = new Disciplina();
					 * disciplina1.setDisciplina("Bando de dados"); disciplina1.setNota(90);
					 * 
					 * aluno1.getDisciplinas().add(disciplina1);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum disicplina ? ");

					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina ?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;

							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ? ");
						}
					}

					alunos.add(aluno1);

				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}
				System.out.println("------------Lista Aprovado-----------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + "Com media de =" + aluno.getMediaNota());
				}

				System.out.println("------------Lista Recuperação-----------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + "Com media de =" + aluno.getMediaNota());
				}

				System.out.println("------------Lista Reprovado-----------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + "Com media de =" + aluno.getMediaNota());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();
			e.printStackTrace(); /* Imprime as informações no console */
			JOptionPane.showMessageDialog(null,
					"Erro ao processar notas"); /* Mensagem na tela do sistema para o usuário */

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Linha de erro: " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro de conversão " + saida.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Variavel vazia" + e.getClass());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado" + e.getClass());

		} finally {
			JOptionPane.showMessageDialog(null, "Sistema será encerrado");
		}

	}

	public static void lerArquivo() throws FileNotFoundException {
		
			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
	}

}
