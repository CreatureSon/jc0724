package me.jacobcreech.store;

public class MatrixManager {

	public void manageMatrix() {
		Store homeDepot = new Store();
		homeDepot.setName("Home Depot");

		Store lowes = new Store();
		lowes.setName("Lowes");

		System.out.println("Stores: " + homeDepot.getName() + ", " + lowes.getName());

		homeDepot.createTool();
		lowes.createEmptyTool();
	}

	public void setSales(Store store) {
		store.activateSale();
	}

	public void endSales(Store store) {
		store.endSale();
	}

	public void checkForSale(Store store) {
		if (store.isSaleActive()) {
			System.out.println(store.getName() + " has a sale active!");
		}
		else {
			System.out.println(store.getName() + " does not have a sale active!");
		}
	}
}
