package wafaa.springbootProject.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Serv {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "serv")
	
	private int id;
	private String titre;
	private String info;
	private String nomresponsable;
	private String nomclient;
	private String price;
	

	public Serv() {
	}
	
	

	public Serv(int id, String titre, String info, String nomresponsable, String nomclient, String price) {
		super();
		this.id = id;
		this.titre = titre;
		this.info = info;
		this.nomresponsable = nomresponsable;
		this.nomclient = nomclient;
		this.price = price;
	}
	
	



	public String getNomresponsable() {
		return nomresponsable;
	}



	public void setNomresponsable(String nomresponsable) {
		this.nomresponsable = nomresponsable;
	}



	public String getNomclient() {
		return nomclient;
	}



	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

    public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	

}
