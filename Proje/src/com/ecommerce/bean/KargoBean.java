package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Kargo;
import com.mergeCons.egitim.util.EntityUtil;

public class KargoBean {
private Kargo kargo = new Kargo();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(kargo);
		em.getTransaction().commit();
		kargo = new Kargo();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(kargo);
		em.getTransaction().commit();
		kargo = new Kargo();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(kargo);
		em.getTransaction().commit();
		kargo = new Kargo();
	}
	
	@SuppressWarnings("unchecked")
	public List<Kargo> getKargoListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Kargo";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public Kargo getKargo() {
		return kargo;
	}

	public void setKargo(Kargo kargo) {
		this.kargo = kargo;
	}

}
