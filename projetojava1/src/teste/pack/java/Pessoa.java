package teste.pack.java;
import java.util.Date;

public class Pessoa {
	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	private int tel; 
	
	private Date dataNascimento;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}

	public int getTel() {
		return tel;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
}
