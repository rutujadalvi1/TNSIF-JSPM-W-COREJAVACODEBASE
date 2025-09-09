package com.tnsif.HierarchicalInheritanceDemo;

public class HirarchicalInheritanceDemo {
      public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
//Student s1=new Student("Shubhaqm", "Pune", "SY", 23.78f);
//Employee e1=new Employee("Shubham", "Pune", 1001, 123456, "CS");
		
		Person p;
		p=new Person("Shubham","Pune");
		System.out.println(p);
		
		p=new Employee("Nikita", "nashik", 1002, 23456, "QA");
		System.out.println(p);
		
		p=new Student("Aditya", "Mumbai", "TY", 12345f);
		System.out.println(p);
				
      }

}
