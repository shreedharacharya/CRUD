/**
 * 
 */
/**
 * @author sacharya
 *
 */
package product.domain;

public class Product implements Item {

	private int productNum;
	private String name;
	private String price;

	public Product(int productNum, String name, String price) {
		this.productNum = productNum;
		this.name = name;
		this.price = price;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

}