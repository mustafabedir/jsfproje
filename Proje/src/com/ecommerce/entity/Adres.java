package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "adres")
public class Adres {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adresID;
	@Column(nullable = false)
	private String adresTipi;
	@Column(nullable = false)
	private String adresDetay;
	public Long getAdresID() {
		return adresID;
	}
	public void setAdresID(Long adresID) {
		this.adresID = adresID;
	}
	public String getAdresTipi() {
		return adresTipi;
	}
	public void setAdresTipi(String adresTipi) {
		this.adresTipi = adresTipi;
	}
	public String getAdresDetay() {
		return adresDetay;
	}
	public void setAdresDetay(String adresDetay) {
		this.adresDetay = adresDetay;
	}
	
}