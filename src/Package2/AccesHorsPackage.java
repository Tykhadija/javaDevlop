package Package2;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle{

	public AccesHorsPackage(String nom){
		super(nom);
	}
	
	public AccesHorsPackage(long id,String nom){
		super(id,nom);
	}
	
	public void afficher(Salle s) {
		System.out.println(s.id );
		System.out.println(s.nom );
		System.out.println(id );
		System.out.println(nom);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salle sb = new Salle("Salle B");
		System.out.print("id "+ sb.id + " nom "+ sb.nom);
	}

	//je remarque que l'acces aux atrubits declarer protected qui sont dans la classe Salle visible a les classes qui ont le meme package est les calsses filles(acces par heritage)
}
