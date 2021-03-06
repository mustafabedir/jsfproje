package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Kategori;
import com.mergeCons.egitim.util.EntityUtil;

public class KategoriBean {
private Kategori kategori = new Kategori();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(kategori);
		em.getTransaction().commit();
		kategori = new Kategori();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(kategori);
		em.getTransaction().commit();
		kategori = new Kategori();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(kategori);
		em.getTransaction().commit();
		kategori = new Kategori();
	}
	
	@SuppressWarnings("unchecked")
	public List<Kategori> getKategoriListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Kategori";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

	
	
}
