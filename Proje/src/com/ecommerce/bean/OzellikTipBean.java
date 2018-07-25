package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.OzellikTip;
import com.mergeCons.egitim.util.EntityUtil;

public class OzellikTipBean {
private OzellikTip ozellikTip = new OzellikTip();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(ozellikTip);
		em.getTransaction().commit();
		ozellikTip = new OzellikTip();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(ozellikTip);
		em.getTransaction().commit();
		ozellikTip = new OzellikTip();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(ozellikTip);
		em.getTransaction().commit();
		ozellikTip = new OzellikTip();
	}
	
	@SuppressWarnings("unchecked")
	public List<OzellikTip> getOzellikTipListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM OzellikTip";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public OzellikTip getOzellikTip() {
		return ozellikTip;
	}

	public void setOzellikTip(OzellikTip ozellikTip) {
		this.ozellikTip = ozellikTip;
	}

	
}