package testandoBuilder;

public class App {

	public static void main(String[] args) {

//		try {
//			System.out.println(Calculadora.somarInt('a', 5));
//		} catch (NotANumberException e) {
//			System.out.println("Error: " + e.getMessage());
//		}	

		// builder manual interno
		Pessoa pessoa = Pessoa.builder().nome("Orlando").idade(30).peso(83.7).build();

		System.out.println(pessoa);

		// builder manual externo
		Product produto = new ProductBuilder().name("RTX 3080").price(2500.0).build();

		System.out.println(produto);

		// builder lombok
		Vehicle vehicle = Vehicle.builder().name("Civic").brand("Honda").build();

		System.out.println(vehicle);

	}

}
