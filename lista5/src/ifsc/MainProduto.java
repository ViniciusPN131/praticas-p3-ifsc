package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();

		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();

		p1.setNome("CameloAfricano");
		p1.setFornecedor("Jalin Rabei");
		p1.setCodBarras(53948756394876l);
		p1.setPreco(69.0);

		p2.setNome("CameloVascaino");
		p2.setFornecedor("Jalin Rabei");
		p2.setCodBarras(53948756356475l);
		p2.setPreco(120.0);

		p3.setNome("CameloGuloso");
		p3.setFornecedor("Jalin Rabei");
		p3.setCodBarras(53948756675656l);
		p3.setPreco(23.56);

		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);

		for (Produto produto : produtos) {

			System.out.println(produto.getNome());
			System.out.println(produto.getFornecedor());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco()+"\n");
			
		}

	}

}
























