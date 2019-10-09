/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejdbc;

/**
 *
 * @author pedago
 */
public class ProductEntity {
	private int id = -1;
	private String name = "Unknown";
	private float price = 0.0f;

	public ProductEntity(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
	}		
}
