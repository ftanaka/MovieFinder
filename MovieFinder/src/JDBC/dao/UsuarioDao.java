package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JDBC.ConnectionFactory;
import JDBC.modelo.Usuario;

public class UsuarioDao {
	private Connection connection;
	
	public UsuarioDao() {
		this.setConnection(new ConnectionFactory().getConnection());
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void adiciona (Usuario usuario) {
		String buf = "INSERT INTO Usuario " +
					 "(nome,pais,email,ano,senha) " +
					 "VALUES (?,?,?,?,?);";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(buf);
			
			// seta os valores
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getPais());
			stmt.setString(3, usuario.getEmail());
			stmt.setInt(4, usuario.getAno());
			stmt.setString(5, usuario.getSenha());
			
			//executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
