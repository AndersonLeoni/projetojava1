package teste.pack.java;

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}



	public int getTel() {
		return tel;
	}



	public void setTel(int tel) {
		this.tel = tel;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
