package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "kargo")
public class Kargo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long kargoID;
	@Column(nullable = false)
	private String sirketAdi;
	@Column(nullable = false)
	private String adres;
	@Column(nullable = false)
	private String telefon;
	@Column(nullable = false)
	private String webSite;
	@Column(nullable = false)
	private String eMail;
	public Long getKargoID() {
		return kargoID;
	}
	public void setKargoID(Long kargoID) {
		this.kargoID = kargoID;
	}
	public String getSirketAdi() {
		return sirketAdi;
	}
	public void setSirketAdi(String sirketAdi) {
		this.sirketAdi = sirketAdi;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
}
