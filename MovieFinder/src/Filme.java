
public class Filme {

	private String nomePort;
	private String nomeOrig;
	private int ano;
	private int duracao;
	private int classificacao;
	private String sinopse;

	public void setNomePort(String nome) {
		this.nomePort = nome;
	}
	
	public void setNomeOrig (String nome) {
		this.nomeOrig = nome;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public void setDuracao (int duracao) {
		this.duracao = duracao;
	}
	
	public void setClassificacao (int classificacao) {
		this.classificacao = classificacao;
	}
	
	public void setSinopse (String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getNomePort () {
		return this.nomePort;
	}
	
	public String getNomeOrig () {
		return this.nomeOrig;
	}
	
	public int getAno () {
		return this.ano;
	}
	
	public int getDuracao () {
		return this.duracao;
	}
	
	public int getClassificacao () {
		return this.classificacao;
	}
	
	public String getSinopse () {
		return this.sinopse;
	}
}
