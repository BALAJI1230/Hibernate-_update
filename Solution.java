package org.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Contact cnt=session.get(Contact.class,2);
		System.out.println(cnt);
		
		session.getTransaction().commit();
		session.close();
	}

}
