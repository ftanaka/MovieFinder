package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JDBC.ConnectionFactory;
import JDBC.modelo.Filme;

public class FilmeDao {
	private Connection connection;
	
	public FilmeDao() {
		this.setConnection(new ConnectionFactory().getConnection());
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void adiciona (Filme filme) {
		String buf = "INSERT INTO Filme " +
					 "(nomePort,nomeOrig,ano,duracao,sinopse) " +
					 "VALUES (?,?,?,?,?);";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(buf);
			
			// seta os valores
			stmt.setString(1, filme.getNomePort());
			stmt.setString(2, filme.getNomeOrig());
			stmt.setInt(3, filme.getAno());
			stmt.setInt(4, filme.getDuracao());
			stmt.setString(5, filme.getSinopse());
			
			//executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
