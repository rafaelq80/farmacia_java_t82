package farmacia_java.model;

import java.text.NumberFormat;

public abstract class Produto {

	private int id;
	private String nome;
	private int tipo;
	private float preco;
	
	public Produto(int id, String nome, int tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {

		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		String tipo = "";

		switch (this.tipo) {
			case 1 -> tipo = "Medicamento";
			case 2 -> tipo = "Cosmético";
			default -> tipo = "Inválido";
		}

		System.out.println("***************************************");
		System.out.println("DADOS DO PRODUTO                       ");
		System.out.println("***************************************");
		System.out.println("ID do Produto: " + this.id);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Tipo do Produto: " + tipo);
		System.out.println("Preço do Produto: " + nfMoeda.format(this.preco));
	}
	
}
