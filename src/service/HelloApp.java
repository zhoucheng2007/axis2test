package service;

public class HelloApp {
	 /**
	  * ���⹫���ķ��񷽷�
	  */
	 public String sayHello(String name) {
		 System.out.println("���յ��Ĳ���Ϊ"+name);
		 System.out.println("���صĲ���Ϊ"+name);
	  return "Hello," + name;
	 }
	 
	 /**
	  * ���⹫���ķ��񷽷�
	  */
	 public String saySorry(String name,String word) {
		 System.out.println("���յ��Ĳ���Ϊ"+name+"   "+word);
	  return "sorry," + name+", beause of" +word;
	 }
}
