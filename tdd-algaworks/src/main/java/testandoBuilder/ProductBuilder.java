package testandoBuilder;

public class ProductBuilder {

	private Product instance;

	public ProductBuilder() {
		instance = new Product();
	}

	public Product build() {
		return instance;
	}

	public ProductBuilder name(String name) {
		instance.setName(name);
		return this;
	}

	public ProductBuilder price(Double price) {
		instance.setPrice(price);
		return this;
	}

}
