package service;

public class HelloApp {
	 /**
	  * 对外公开的服务方法
	  */
	 public String sayHello(String name) {
	  return "Hello," + name;
	 }
	 
	 /**
	  * 对外公开的服务方法
	  */
	 public String saySorry(String name,String word) {
	  return "sorry," + name+", beause of" +word;
	 }
}
