package entities;

public class Livro {
	private String nome;
	private String isbn;
	private int ano;
	private String autor;
	
	public Livro() {}

	public Livro(String nome, String isbn, int ano, String autor) {
		super();
		this.nome = nome;
		this.isbn = isbn;
		this.ano = ano;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro - " + nome + ", " + isbn + ", " + ano + ", " + autor;
	}
	
	
}
