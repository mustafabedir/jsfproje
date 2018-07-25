package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "musteri")
public class Musteri {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long musteriID;
	@Column(nullable = false)
	private String ad;
	@Column(nullable = false)
	private String soyad;
	@Column(nullable = false)
	private String telefon;
	@Column(nullable = false)
	private String tckn;
	@ManyToOne
	@JoinColumn(name  ="adresID", referencedColumnName="adresID")
	private Adres adres;
	public Long getMusteriID() {
		return musteriID;
	}
	public void setMusteriID(Long musteriID) {
		this.musteriID = musteriID;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getTckn() {
		return tckn;
	}
	public void setTckn(String tckn) {
		this.tckn = tckn;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
}
