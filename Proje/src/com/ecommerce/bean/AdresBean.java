package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Adres;
import com.mergeCons.egitim.util.EntityUtil;

public class AdresBean {
private Adres adres = new Adres();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(adres);
		em.getTransaction().commit();
		adres = new Adres();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(adres);
		em.getTransaction().commit();
		adres = new Adres();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(adres);
		em.getTransaction().commit();
		adres = new Adres();
	}
	
	@SuppressWarnings("unchecked")
	public List<Adres> getAdresListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Adres";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	
}

