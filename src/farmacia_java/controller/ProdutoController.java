package farmacia_java.controller;

import java.util.ArrayList;
import java.util.Optional;

import farmacia_java.model.Produto;
import farmacia_java.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	// Criar a Collection ArrayList
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	// Variável para controlar os números das produtos
	int id = 0;

	@Override
	public void procurarPorId(int id) {

		Optional<Produto> produto = buscarNaCollection(id);

		if (produto.isPresent())
			produto.get().visualizar();
		else
			System.out.printf("\nO Produto número %d não foi encontrado", id);

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O Produto foi criado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		Optional<Produto> buscaProduto = buscarNaCollection(produto.getId());

		if (buscaProduto.isPresent()) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto.get()), produto);
			System.out.printf("\nO Produto ID %d foi atualizado com sucesso!", produto.getId());
		} else
			System.out.printf("\nO Produto ID %d não foi encontrado", produto.getId());

	}

	@Override
	public void deletar(int id) {
		Optional<Produto> produto = buscarNaCollection(id);

		if (produto.isPresent()) {
			if (listaProdutos.remove(produto.get()) == true)
				System.out.printf("\nO Produto ID %d foi excluído com sucesso!", id);
		} else
			System.out.printf("\nO Produto ID %d não foi encontrado", id);

	}

	// Métodos Auxiliares

	public int gerarId() {
		return ++id;
	}

	public Optional<Produto> buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id)
				return Optional.of(produto);
		}

		return Optional.empty();
	}
}
