package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JDBC.ConnectionFactory;
import JDBC.modelo.Genero;

public class GeneroDao {
	private Connection connection;
	
	public GeneroDao() {
		this.setConnection(new ConnectionFactory().getConnection());
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void adiciona (Genero genero) {
		String buf = "INSERT INTO Genero (nome) VALUES (?);";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(buf);
			
			// seta os valores
			stmt.setString(1, genero.getNome());
			
			//executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
