package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		
		System.out.println(a.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(Math.PI);
		System.out.println(AreaCirc.PI);
	}
}
