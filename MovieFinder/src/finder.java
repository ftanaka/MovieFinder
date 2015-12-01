import java.util.List;

import JDBC.dao.FiltrosDao;
import JDBC.modelo.Filme;

public class finder {

	public static void main(String[] args) {
		FiltrosDao filtro = new FiltrosDao();
		List<Filme> filmes= filtro.filtraPessoa("Brasil");
		
		System.out.println(filmes);
	}

}
