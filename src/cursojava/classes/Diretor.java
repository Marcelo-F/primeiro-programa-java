package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/*Classe filha que herda da classe pessoa*/
public class Diretor extends Pessoa  implements PermitirAcesso{
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
	private String login;
	private String senha;
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3900.78;
	}
	

	@Override
	public boolean autenticar(String login, String senha) {
		this.login =login;
		this.senha =senha;
		
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("direct") && senha.equals("321");
	}
	
	
	
}
