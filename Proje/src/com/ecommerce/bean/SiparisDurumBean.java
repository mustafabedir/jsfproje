package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.SiparisDurum;
import com.mergeCons.egitim.util.EntityUtil;

public class SiparisDurumBean {
private SiparisDurum siparisDurum = new SiparisDurum();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(siparisDurum);
		em.getTransaction().commit();
		siparisDurum = new SiparisDurum();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(siparisDurum);
		em.getTransaction().commit();
		siparisDurum = new SiparisDurum();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(siparisDurum);
		em.getTransaction().commit();
		siparisDurum = new SiparisDurum();
	}
	
	@SuppressWarnings("unchecked")
	public List<SiparisDurum> getSiparisDurumListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM SiparisDurum";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public SiparisDurum getSiparisDurum() {
		return siparisDurum;
	}

	public void setSiparisDurum(SiparisDurum siparisDurum) {
		this.siparisDurum = siparisDurum;
	}


}
