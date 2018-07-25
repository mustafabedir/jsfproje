package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Musteri;
import com.mergeCons.egitim.util.EntityUtil;

public class MusteriBean {
private Musteri musteri = new Musteri();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(musteri);
		em.getTransaction().commit();
		musteri = new Musteri();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(musteri);
		em.getTransaction().commit();
		musteri = new Musteri();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(musteri);
		em.getTransaction().commit();
		musteri = new Musteri();
	}
	
	@SuppressWarnings("unchecked")
	public List<Musteri> getMusteriListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Musteri";
			Query query = em.createQuery(queryString);
		return query.getResultList();
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	
	
}