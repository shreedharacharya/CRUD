package product.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import product.domain.Item;
import product.domain.Product;

public class ProductXMLDAO implements IDAO {

	private Collection<Item> products = new ArrayList<>();

	@Override
	public Item delete(Item product) {
		if (products.contains(product)) {
			products.remove(product);
			return product;
		}
		return null;
	}

	@Override
	public Item find(String name) {
		for (Item product : products) {
			if (((Product) product).getName().equals(name)) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Item load(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> loadAll() {
		return (List<Item>) products;
	}

	@Override
	public Item save(Item product) {
		products.add(product);
		return null;
	}

	@Override
	public Item update(Item productin) {
		for (Item product : products) {
			if (((Product) product).getProductNum() == ((Product) productin).getProductNum()) {
				products.remove(product);
				products.add(productin);
				return productin;
			}
		}

		return null;
	}

}
