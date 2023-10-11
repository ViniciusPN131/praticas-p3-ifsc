package ifsc;

public class Produto {
	
	String nome;
	Long codBarras;
	
	Double preco;
	String fornecedor;
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(Long codBarras) {
		this.codBarras = codBarras;
	}
	
}
