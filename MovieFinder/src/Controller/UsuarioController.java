package Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import JDBC.dao.FiltrosDao;
import JDBC.dao.UsuarioDao;
import JDBC.modelo.Usuario;

public class UsuarioController {

	@RequestMapping("/cadastro")
	public void cadastra(Usuario usuario){
		UsuarioDao dao = new UsuarioDao();
		dao.adiciona(usuario);
	}
	
	@RequestMapping("/buscaFilme")
	public void busca(String searchnamesimples) {
		FiltrosDao dao = new FiltrosDao();
		
		dao.filtraNome(searchnamesimples);
	}
	
}
