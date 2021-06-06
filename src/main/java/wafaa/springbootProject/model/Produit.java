package wafaa.springbootProject.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

	@Id
	private int ref;
	private String imageURL;
	private String info;
	private String name;
	private String price;
	
	
	
	
	public Produit() {
	}
	
	
	public Produit(int ref, String info, String name, String price , String imageURL) {
		super();
		this.ref = ref;
		this.info = info;
		this.name = name;
		this.price = price;
		this.imageURL= imageURL;
	
	}
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getRef() {
		return ref;
	}
	
	
	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
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
