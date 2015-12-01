package JDBC.modelo;

public class Usuario {
	private long ID;
	private String nome;
	private String pais;
	private String email;
	private String senha;
	private int anoNasc; 
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setPais (String pais) {
		this.pais = pais;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void setSenha (String senha) {
		this.senha = senha;
	}
	
	public void setdAnoNasc (int ano) {
		this.anoNasc = ano;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public String getPais () {
		return this.pais;
	}
	
	public String getEmail () {
		return this.email;
	}
	
	public String getSenha () {
		return this.senha;
	}
	
	public int getAnoNasc () {
		return this.anoNasc;
	}
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}
}
