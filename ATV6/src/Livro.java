
public class Livro {
	private int isbn;
	private String autor, editora, tituloLivro;
	
	public Livro(int isbn, String titulo, String editora, String autor) {
		this.isbn = isbn;
		this.tituloLivro = titulo;
		this.editora = editora;
		this.autor = autor;
	}
	
	public void imprimeDados() {
		System.out.println("Título: " + this.tituloLivro);
		System.out.println("Autor: " + this.autor);
		System.out.println("Editora: " + this.editora);
		System.out.println("ISBN: " + this.isbn);
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public String getTituloLivro() {
		return tituloLivro;
	}
}
