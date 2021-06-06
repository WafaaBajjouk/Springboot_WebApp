package wafaa.springbootProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Commande {
	
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "commande")
	private int id;
	private int idproduit;
	private String nameclient;
	private int Qty;
	private String price;
	private String address;
	
	public Commande(int id, int idproduit, String nameclient, int Qty, String price, String address) {
		super();
		this.id = id;
		this.idproduit = idproduit;
		this.nameclient = nameclient;
		this.Qty = Qty;
		this.price = price;
		this.address = address;
	}

	public Commande() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public int getIdproduit() {
		return idproduit;
	}

	public void setIdproduit(int idproduit) {
		this.idproduit = idproduit;
	}

	public String getNameclient() {
		return nameclient;
	}

	public void setNameclient(String nameclient) {
		this.nameclient = nameclient;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int Qty) {
		this.Qty = Qty;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
