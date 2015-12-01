package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JDBC.ConnectionFactory;
import JDBC.modelo.Pais;

public class PaisDao {
	private Connection connection;
	
	public PaisDao() {
		this.setConnection(new ConnectionFactory().getConnection());
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void adiciona (Pais pais) {
		String buf = "INSERT INTO Pais (nome) VALUES (?);";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(buf);
			
			// seta os valores
			stmt.setString(1, pais.getNome());
			
			//executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
