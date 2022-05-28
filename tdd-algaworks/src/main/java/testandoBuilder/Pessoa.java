package testandoBuilder;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Double peso;

	public Pessoa() {

	}

	public Pessoa(String nome, Integer idade, Double peso) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setPeso(peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}

	// Metodo para instanciar um builder
	public static Builder builder() {
		return new Builder();
	}

	// classe builder interna
	public static class Builder {
		private String nome;
		private Integer idade;
		private Double peso;

		public Pessoa build() {
			return new Pessoa(nome, idade, peso);
		}

		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder idade(Integer idade) {
			this.idade = idade;
			return this;
		}

		public Builder peso(Double peso) {
			this.peso = peso;
			return this;
		}

	}

}
