package info.inetsolv.SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class App {

public static void main(String[] args) {

	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
	
 HibernateTemplate hibernateTemplate = container.getBean(HibernateTemplate.class);
 	Employee employee = new Employee();
// Employee employee = hibernateTemplate.load(Employee.class, 1);
  hibernateTemplate.load(employee, 1); 
	
	System.out.println(employee.getEno());
	System.out.println(employee.getName());
	System.out.println(employee.getSalary());

	container.close();
}
}
