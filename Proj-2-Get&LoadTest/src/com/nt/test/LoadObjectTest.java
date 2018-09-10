package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Student;

import javassist.tools.rmi.ObjectNotFoundException;

public class LoadObjectTest {

	public static void main(String[] args) {
		/* declare local variable */
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Student student = null;
		Boolean flag = false;

		/* bootstrap hibernate */

		cfg = new Configuration();

		/* locate and load cfg.xml */

		cfg = cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");

		/* build session factory */

		factory = cfg.buildSessionFactory();

		/* open or create new session */

		session = factory.openSession();

		/*
		 * using this session get data from student table and store into student object
		 */

		try {
			/*
			 * this code should be placed in try catch block because there is some
			 * possibility of getting exception
			 */

			student = session.load(Student.class, 101);

			/* if record not found load method throws Exceptions 
			 * print student info by using getter method */

				System.out.println(student.getSid() + "  " + student.getSname() + "  " + student.getAddr());

			
				

		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			/* close all object */

			session.close();
			factory.close();

		}

	}

}
