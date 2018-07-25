package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "marka")
public class Marka {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long markaID;
	@Column(nullable = false)
	private String ad;
	@Column(nullable = true)
	private String aciklama;
	@ManyToOne
	@JoinColumn(name = "resimID", referencedColumnName="resimID")
	private Resim resim;
	public Long getMarkaID() {
		return markaID;
	}
	public void setMarkaID(Long markaID) {
		this.markaID = markaID;
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
