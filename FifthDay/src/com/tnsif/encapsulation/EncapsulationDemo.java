package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		//object creation

				OopsConceptDemo obj=new OopsConceptDemo();
				
				obj.setAge(20);
				obj.setName("Rutuja");
				obj.setSerialNum(96969);
				
				System.out.println(obj.getName());
				System.out.println(obj.getAge());
				System.out.println(obj.getSerialNum());
				
				System.out.println(obj);

			}

		}

