import java.util.ArrayList;

public class ListaLivros {
	private ArrayList<Livro> lista = new ArrayList<Livro>();
	private boolean achou;
	private Livro livroRetornar;

	public void adicionarLivro(Livro livro) {
		lista.add(livro);
		System.out.println("Livro adicionado!");
	}
	
	public void removerLivro(Livro livro) {
		if (lista.contains(livro)) {
			lista.remove(livro);
			System.out.println("Livro removido!");
			return;
		}
		System.out.println("Livro não encontrado!");
	}
	
	public void imprimirLivros() {
		lista.forEach((livro) -> {
			livro.imprimeDados();
		});
	}
	
	public boolean verificarLivro(Livro livroBuscar) {
		achou = false;
		
		lista.forEach((livro) -> {
			if (livro.equals(livroBuscar)) {
				achou = true;
			}
		});
		
		return achou;
	}
	
	public Livro buscarLivro(Livro livroBuscar) {
		livroRetornar = null;
		
		lista.forEach((livro) -> {
			if (livro.equals(livroBuscar)) {
				livroRetornar = livro;
			}
		});
		
		return livroRetornar;
	}
	
	public boolean verificarVazia() {
		if (lista.size() == 0) {
			return true;
		}
		
		return false;
	}
}
