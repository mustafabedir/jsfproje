package com.ecommerce.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecommerce.entity.SatisDetay;
import com.mergeCons.egitim.util.EntityUtil;

public class SatisDetayBean {
private SatisDetay satisDetay = new SatisDetay();
	
	public void kaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(satisDetay);
		em.getTransaction().commit();
		satisDetay = new SatisDetay();
	}
	
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(satisDetay);
		em.getTransaction().commit();
		satisDetay = new SatisDetay();
	}

	public void duzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(satisDetay);
		em.getTransaction().commit();
		satisDetay = new SatisDetay();
	}
	
	@SuppressWarnings("unchecked")
	public List<SatisDetay> getSatisDetayListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		String queryString = "FROM SatisDetay";
			Query query = em.createQuery(queryString);
		return query.getResultList();
		
	}

	public SatisDetay getSatisDetay() {
		return satisDetay;
	}

	public void setSatisDetay(SatisDetay satisDetay) {
		this.satisDetay = satisDetay;
	}

}
