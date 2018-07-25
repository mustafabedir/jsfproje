package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Marka;
import com.mergeCons.egitim.util.EntityUtil;

public class MarkaBean {
private Marka marka = new Marka();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(marka);
		em.getTransaction().commit();
		marka = new Marka();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(marka);
		em.getTransaction().commit();
		marka = new Marka();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(marka);
		em.getTransaction().commit();
		marka = new Marka();
	}
	
	@SuppressWarnings("unchecked")
	public List<Marka> getMarkaListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Marka";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public Marka getMarka() {
		return marka;
	}

	public void setMarka(Marka marka) {
		this.marka = marka;
	}

	
}
