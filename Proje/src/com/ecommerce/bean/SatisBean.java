package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Satis;
import com.mergeCons.egitim.util.EntityUtil;

public class SatisBean {
private Satis satis = new Satis();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(satis);
		em.getTransaction().commit();
		satis = new Satis();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(satis);
		em.getTransaction().commit();
		satis = new Satis();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(satis);
		em.getTransaction().commit();
		satis = new Satis();
	}
	
	@SuppressWarnings("unchecked")
	public List<Satis> getSatisListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Satis";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public Satis getSatis() {
		return satis;
	}

	public void setSatis(Satis satis) {
		this.satis = satis;
	}


}
