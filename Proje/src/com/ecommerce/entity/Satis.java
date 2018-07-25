package com.ecommerce.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "satis")
public class Satis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long satisID;
	@ManyToOne
	@JoinColumn(name = "musteriID",referencedColumnName="musteriID")
	private Musteri musteri;
	private Date satisTarihi;
	private double toplamTutar;
	private boolean sepetteMi;
	@ManyToOne
	@JoinColumn(name = "siparisDurumID", referencedColumnName="siparisDurumID")
	private SiparisDurum siparisDurum;
	@ManyToOne
	@JoinColumn(name = "kargoID", referencedColumnName="kargoID")
	private Kargo kargo;
	private Long kargoTakipNo;
	public Long getSatisID() {
		return satisID;
	}
	public void setSatisID(Long satisID) {
		this.satisID = satisID;
	}
	public Musteri getMusteri() {
		return musteri;
	}
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	public Date getSatisTarihi() {
		return satisTarihi;
	}
	public void setSatisTarihi(Date satisTarihi) {
		this.satisTarihi = satisTarihi;
	}
	public double getToplamTutar() {
		return toplamTutar;
	}
	public void setToplamTutar(double toplamTutar) {
		this.toplamTutar = toplamTutar;
	}
	public boolean isSepetteMi() {
		return sepetteMi;
	}
	public void setSepetteMi(boolean sepetteMi) {
		this.sepetteMi = sepetteMi;
	}
	public SiparisDurum getSiparisDurum() {
		return siparisDurum;
	}
	public void setSiparisDurum(SiparisDurum siparisDurum) {
		this.siparisDurum = siparisDurum;
	}
	public Kargo getKargo() {
		return kargo;
	}
	public void setKargo(Kargo kargo) {
		this.kargo = kargo;
	}
	public Long getKargoTakipNo() {
		return kargoTakipNo;
	}
	public void setKargoTakipNo(Long kargoTakipNo) {
		this.kargoTakipNo = kargoTakipNo;
	}
}
