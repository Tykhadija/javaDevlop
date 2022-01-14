package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Salle S1 = new Salle();
		//Salle S2 = new Salle("Salle Informatique");
		//Salle S3 = new Salle(1,"Salle des cours");
		
		//System.out.println("Object 1 ");
		//System.out.println("Object 2 : " + S2.nom);
		//System.out.println("Object 3 : " + S3.id + " , " + S3.nom);
		
		//----Question 5/6/7 
		Salle s1= new SalleCours(1,"Salle 1", 20);// correct
		SalleCours s2= new SalleCours(2, "Salle 2", 20);// correct
		//SalleCours s3= s1; 
		// incorrect ----> SalleCours s3= (SalleCours)s1
		SalleCours s4= s2; // correct
		
		//-----Question 8/9/10
		Salle s5= new Laboratoire( 2,"LABO","CHIMIE");
		SalleCours s6= new SalleCours(2, "Salle 2", 20);
		SalleCours s7= (SalleCours)s5;// incorrect
		
		// le type de s5 est Salle par contre le type de s7 est SalleCours alors le type des object est différent
		// Non c'est pas possible d'utiliser un cast car le s5 instancier a la classe fille laboratoire, donc la classe mére salle sera une classe fille laboratoire . Alors on peut pas faire un casting entre deux classe filles 
		
		SalleCours s8= s6;
	}

}
