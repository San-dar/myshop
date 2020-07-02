
public class Item {
	private String name;
	private int price;
	private int amount;

	public Item(String name, int price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
