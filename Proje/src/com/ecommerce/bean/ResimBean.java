package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Resim;
import com.mergeCons.egitim.util.EntityUtil;

public class ResimBean {
private Resim resim = new Resim();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(resim);
		em.getTransaction().commit();
		resim = new Resim();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(resim);
		em.getTransaction().commit();
		resim = new Resim();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(resim);
		em.getTransaction().commit();
		resim = new Resim();
	}
	
	@SuppressWarnings("unchecked")
	public List<Resim> getResimBeanListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Resim";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public Resim getResim() {
		return resim;
	}

	public void setResim(Resim resim) {
		this.resim = resim;
	}

}