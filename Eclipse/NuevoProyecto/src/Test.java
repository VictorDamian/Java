
public class Test {
	public static void main(String[] args){
		Widget widget = new Widget(); //creamos un objeto llamado "widget"
		doSomething();
		
		BigWidget bigWidget = new BigWidget();//creamos un  nuevo objeto llamado "bigWidget"
		doSomething(bigWidget);
		
		widget = bigWidget; //en esta "widget" heredara lo que contenga "bigWidget"
		doSomething(widget);
	
	}
	
	static void doSomething(){
		System.out.println("doSomething star");
		try{
			System.out.println("doSomething try block");
					return;
		}catch (Exception e){
			System.out.println("doSomething exception caught");
			
		}finally{
			System.out.println("doSomething finally block");
		}
		System.out.println("doSomething and");
	}
	
	static void doSomething(Widget w){
		System.out.println("doSomething using Widget.");
	}
	static void doSomething(BigWidget bw){
		System.out.println("doSomething using BigWidget.");
	}

}
