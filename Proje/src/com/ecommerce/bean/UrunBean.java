package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.Urun;
import com.mergeCons.egitim.util.EntityUtil;

public class UrunBean {
private Urun urun = new Urun();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(getUrun());
		em.getTransaction().commit();
		setUrun(new Urun());
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(getUrun());
		em.getTransaction().commit();
		setUrun(new Urun());
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(getUrun());
		em.getTransaction().commit();
		setUrun(new Urun());
	}
	
	@SuppressWarnings("unchecked")
	public List<Urun> getUrunListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM Urun";
			Query query = em.createQuery(queryString);
		return query.getResultList();
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}
	

}
