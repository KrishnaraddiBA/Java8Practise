import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	private int id;
	private String name;
	private String city;
	private int price;
	public Product(int id, String name, String city, int price) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.price = price;
	}
	public Product() {
		super();
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", city=" + city + ", price=" + price + "]";
	}
	
	

}

public class ProductMain {
	
	public static void main(String[] args) {
		
		List<Product> li=new ArrayList<Product>();
		li.add(new Product(1, "Pen", "Gadag", 10));
		li.add(new Product(2, "RubberMachine", "Gadag", 95000));
		li.add(new Product(3, "Remould", "Gadag", 1000000));
		List<Product> collect = li.stream().filter(s->s.getPrice()>10000).collect(Collectors.toList());
	
	collect.forEach(System.out::println);
	
	}
	

}
