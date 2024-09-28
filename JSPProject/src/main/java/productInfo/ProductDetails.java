package productInfo;

public class ProductDetails {

	private int id ;
	private String name;
	private String description;
	private int price;
	public int getId() {
		return ( id );
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return (name + "  bean" );
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return (description + "  bean");
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price ;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
