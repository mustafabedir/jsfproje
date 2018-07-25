package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "resim")
public class Resim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long resimID;
	private String resimYolu;
	public Long getResimID() {
		return resimID;
	}
	public void setResimID(Long resimID) {
		this.resimID = resimID;
	}
	public String getResimYolu() {
		return resimYolu;
	}
	public void setResimYolu(String resimYolu) {
		this.resimYolu = resimYolu;
	}
}
