import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class filtrosDAO {
	private Connection connection;
	public filtrosDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public List<String> getGenero () {
		try {
			List<String> generos = new ArrayList<String>();
			PreparedStatement stmt = this.connection.prepareStatement(
					"SELECT nome FROM Genero");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				generos.add(rs.getString("nome"));
			}
		
			return generos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Filme> filtraGenero(String nomeGenero) {
		try {
			List<Filme> filmes = new ArrayList<Filme>();
			PreparedStatement stmt = this.connection.prepareStatement (
					"SELECT * FROM Filme " +
					"INNER JOIN generoFilme ON Filme.IDFilme = generoFilme.IDFilme " +
					"INNER JOIN Genero ON generoFilme.IDGenero = Genero.IDGenero " +
					"WHERE nome = ?");
			stmt.setString (1, nomeGenero);
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				Filme filme = new Filme();
				filme.setNomePort (rs.getString("nomePort"));
				filme.setNomeOrig (rs.getString("nomeOrig"));
				filme.setAno (rs.getInt("ano"));
				filme.setDuracao (rs.getInt ("duracao"));
				filme.setClassificacao (rs.getInt("classificacao"));
				filme.setSinopse (rs.getString ("sinopse"));
	
				filmes.add(filme);
			}
			rs.close();
			stmt.close();
			return filmes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
	
	public List<Filme> filtraNome(String nomeFilme) {
		try {
			List<Filme> filmes = new ArrayList<Filme>();
			PreparedStatement stmt = this.connection.prepareStatement (
					"SELECT * FROM Filme " +
					"WHERE nomePort = ? OR nomeOrig = ?");
			stmt.setString(1, nomeFilme);
			stmt.setString(2, nomeFilme);
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				Filme filme = new Filme();
				filme.setNomePort (rs.getString("nomePort"));
				filme.setNomeOrig (rs.getString("nomeOrig"));
				filme.setAno (rs.getInt("ano"));
				filme.setDuracao (rs.getInt ("duracao"));
				filme.setClassificacao (rs.getInt("classificacao"));
				filme.setSinopse (rs.getString ("sinopse"));
	
				filmes.add(filme);
			}
			rs.close();
			stmt.close();
			return filmes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
	
	public List<Filme> filtraAno(int ano) {
		try {
			List<Filme> filmes = new ArrayList<Filme>();
			PreparedStatement stmt = this.connection.prepareStatement (
					"SELECT * FROM Filme " +
					"WHERE ano = ?");
			stmt.setInt(1, ano);
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				Filme filme = new Filme();
				filme.setNomePort (rs.getString("nomePort"));
				filme.setNomeOrig (rs.getString("nomeOrig"));
				filme.setAno (rs.getInt("ano"));
				filme.setDuracao (rs.getInt ("duracao"));
				filme.setClassificacao (rs.getInt("classificacao"));
				filme.setSinopse (rs.getString ("sinopse"));
	
				filmes.add(filme);
			}
			rs.close();
			stmt.close();
			return filmes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
	
	public List<Filme> filtraNacionalidade(String nomePais) {
		try {
			List<Filme> filmes = new ArrayList<Filme>();
			PreparedStatement stmt = this.connection.prepareStatement (
					"SELECT * FROM Filme " +
					"INNER JOIN paisFilme ON Filme.IDFilme = paisFilme.IDPais " +
					"INNER JOIN Pais ON paisFilme.IDPais = Pais.IDPais " +
					"WHERE nome = ?");
			stmt.setString (1, nomePais);
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				Filme filme = new Filme();
				filme.setNomePort (rs.getString("nomePort"));
				filme.setNomeOrig (rs.getString("nomeOrig"));
				filme.setAno (rs.getInt("ano"));
				filme.setDuracao (rs.getInt ("duracao"));
				filme.setClassificacao (rs.getInt("classificacao"));
				filme.setSinopse (rs.getString ("sinopse"));
	
				filmes.add(filme);
			}
			rs.close();
			stmt.close();
			return filmes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Filme> filtraPessoa(String nome) {
		try {
			List<Filme> filmes = new ArrayList<Filme>();
			PreparedStatement stmt = this.connection.prepareStatement (
					"SELECT * FROM Filme " +
					"INNER JOIN participacomo ON Filme.IDFilme = participacomo.IDFilme " +
					"WHERE nome = ?");
			stmt.setString (1, nome);
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				Filme filme = new Filme();
				filme.setNomePort (rs.getString("nomePort"));
				filme.setNomeOrig (rs.getString("nomeOrig"));
				filme.setAno (rs.getInt("ano"));
				filme.setDuracao (rs.getInt ("duracao"));
				filme.setClassificacao (rs.getInt("classificacao"));
				filme.setSinopse (rs.getString ("sinopse"));
	
				filmes.add(filme);
			}
			rs.close();
			stmt.close();
			return filmes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
