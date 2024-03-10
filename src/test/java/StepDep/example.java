package StepDep;

public class example {
	
	
public static void main(String[] args) {
	example obj = new example();
	obj.tom();
	example.tom2();	
		
		

	}
 public void tom() {
	 int a = 20; 
	 System.out.println(a);
 }
 public static void tom2() {
	 int a = 20; 
	 System.out.println(a);
 }

	
}
