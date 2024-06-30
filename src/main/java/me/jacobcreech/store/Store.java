package me.jacobcreech.store;

public class Store {

	int inventory;
	String name;
	boolean saleActive;
	Tool tools;

	void createTool() {
		tools = new Tool("Hammer", 12);
	}

	void createEmptyTool() {
		Tool emptyTool = new Tool();
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void activateSale() {
		saleActive = true;
	}

	void endSale() {
		saleActive = false;
	}

	boolean isSaleActive() {
		return saleActive;
	}
}
