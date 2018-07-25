package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.OzellikDeger;
import com.mergeCons.egitim.util.EntityUtil;

public class OzellikDegerBean {
private OzellikDeger ozellikDeger = new OzellikDeger();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(ozellikDeger);
		em.getTransaction().commit();
		ozellikDeger = new OzellikDeger();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(ozellikDeger);
		em.getTransaction().commit();
		ozellikDeger = new OzellikDeger();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(ozellikDeger);
		em.getTransaction().commit();
		ozellikDeger = new OzellikDeger();
	}
	
	@SuppressWarnings("unchecked")
	public List<OzellikDeger> getOzellikDegerListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM OzellikDeger";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public OzellikDeger getOzellikDeger() {
		return ozellikDeger;
	}

	public void setOzellikDeger(OzellikDeger ozellikDeger) {
		this.ozellikDeger = ozellikDeger;
	}
	
	
}
