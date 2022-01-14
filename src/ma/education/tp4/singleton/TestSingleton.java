package ma.education.tp4.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Terre t1=Terre.getInstance(1000, 2000);
		Terre t2=Terre.getInstance(4000, 5000);
		
		System.out.println(" Object t1 distanceToSoleil : "+t1.distanceToSoleil + " surface : "+t1.surface);
		System.out.println(" Object t2 distanceToSoleil : "+t2.distanceToSoleil + " surface : "+t2.surface);
		
		//on remarque que la memoire prend le premier instance parce que le signleton permet de créer l'object dans la premiére instantiation
	}

}
