package ma.education.tp6.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class c = CalculatriceMath.class;
		Programmer Progr = (Programmer) c.getAnnotation(Programmer.class);
		
		System.out.println(Progr.id()+":"+Progr.name());
		
	}

}
