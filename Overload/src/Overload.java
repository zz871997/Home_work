//Cach overload(nap chong) phuong thuc trong java
//Vi du sau minh hoa cach nap chong overload phuong thuc trong java phu thuoc vao kieu va so tham so

public class Overload {
	int height;
	MyClass(){
		System.out.println(" Bricks");
		height=0;
	}
	
	MyClass(int i){
		System.out.println("Building new house that is"+i+" feet tall");
		height=i;
	}
	
	void info(){
		System.out.println(" HOuse is "+height+"feet tall");
	}
	
	void info(String a){
		System.out.println(s+":House is "+height+"feet tall");
		
	}
	
	public static void main(String[] args) {
		MyClass t=new MyClass(0);
		t.info();
		t.info("Overload method");
		//Overload contructor
		new MyClass();
	}
}
