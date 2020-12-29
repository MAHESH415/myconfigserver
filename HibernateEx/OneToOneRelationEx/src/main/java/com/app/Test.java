package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {

		Transaction tx=null;

		try(Session ses=HibernateUtil.getsf().openSession())
		{
			tx=ses.beginTransaction();

			Address a1=new Address();

			a1.setAddrId(101);

			a1.setLoc("HYD");

			a1.setPinCode(508233);

			Employee e1=new Employee();

			e1.setEmpId(1);

			e1.setEmpName("mahesh");

			e1.setEmpsal(3.2);

			e1.setAddr(a1);

			Employee e2=new Employee();

			e2.setEmpId(2);

			e2.setEmpName("madhu");

			e2.setEmpsal(4.5);
			

			ses.save(a1);
			
			ses.save(e1);
			
			ses.save(e2);
			
			tx.commit();

		}	
	}
}
