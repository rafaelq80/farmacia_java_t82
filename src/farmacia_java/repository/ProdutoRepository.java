package farmacia_java.repository;

import farmacia_java.model.Produto;

public interface ProdutoRepository {
	
	public void procurarPorId(int id);
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int id);

}
