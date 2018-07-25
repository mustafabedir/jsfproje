package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "kategori")
public class Kategori {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long kategoriID;
	@Column(nullable = false)
	private String ad;
	@Column(nullable = false)
	private String aciklama;
	@ManyToOne
	@JoinColumn(name =  "resimID", referencedColumnName="resimID")
	private Resim resim;
	public Long getKategoriID() {
		return kategoriID;
	}
	public void setKategoriID(Long kategoriID) {
		this.kategoriID = kategoriID;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public Resim getResim() {
		return resim;
	}
	public void setResim(Resim resim) {
		this.resim = resim;
	}
	
}
