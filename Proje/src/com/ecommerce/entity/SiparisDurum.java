package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "siparisdurum")
public class SiparisDurum {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long siparisDurumID;
	private String ad;
	private String aciklama;
	public Long getSiparisDurumID() {
		return siparisDurumID;
	}
	public void setSiparisDurumID(Long siparisDurumID) {
		this.siparisDurumID = siparisDurumID;
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
}
