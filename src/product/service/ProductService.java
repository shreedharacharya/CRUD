package product.service;

import email.EmailSender;
import logging.Logger;
import product.dao.ProductXMLDAO;

public class ProductService extends ItemService {

	public ProductService(ProductXMLDAO dao) {
		super(dao);
		
		addObserver(new EmailSender());
		addObserver(new Logger());
	}

	public void printProductOverview() {
		//getAllItem()
	}

}
