package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;
import modelo.Aluno;

public class ClienteDAO {

	private Connection connection;
	
	public ClienteDAO() {
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void adiciona(Aluno aluno) {
		String sql = "INSERT INTO aluno(nome_aluno) VALUES(?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.execute();
			stmt.close();
		}
		catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
}
