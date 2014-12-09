package service;

public class HelloApp {
	 /**
	  * 对外公开的服务方法
	  */
	 public String sayHello(String name) {
		 System.out.println("接收到的参数为"+name);
		 System.out.println("返回的参数为"+name);
	  return "Hello," + name;
	 }
	 
	 /**
	  * 对外公开的服务方法
	  */
	 public String saySorry(String name,String word) {
		 System.out.println("接收到的参数为"+name+"   "+word);
	  return "sorry," + name+", beause of" +word;
	 }
}
