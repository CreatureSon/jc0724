package me.jacobcreech.store;

public class Tool {

	int inventory;
	String name;
	int price;
	int weight;
	String material;

	Tool() {
		System.out.println("Hello, I am a tool with no name.. Who am I?");
	}

	Tool(String name, int price) {

		this.name = name;
		this.price = price;

		System.out.println("Hello there, I am a tool!");
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
