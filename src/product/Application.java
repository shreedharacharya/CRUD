package product;

import product.dao.ProductXMLDAO;
import product.domain.Item;
import product.domain.Product;
import product.service.AddCommand;
import product.service.ProductService;

public class Application {

	public static void main(String[] args) {

		ProductXMLDAO dao = new ProductXMLDAO();
		ProductService service = new ProductService(dao);
		Item product1 = new Product(1,"mouse","100");
		AddCommand addProduct1 = new AddCommand(product1,service);
		addProduct1.execute();
		
	}
}
