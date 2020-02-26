package curso.java.exececao;

public class ExecaoProcessarNota  extends Exception{
	
	public ExecaoProcessarNota(String erro) {
		super("Um erro ao processar o arquivo" + erro);
	}

}
