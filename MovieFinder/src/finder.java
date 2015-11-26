import java.util.List;

public class finder {

	public static void main(String[] args) {
		filtrosDAO filtro = new filtrosDAO();
		List<Filme> filmes= filtro.filtraPessoa("Brasil");
		
		System.out.println(filmes);
	}

}
