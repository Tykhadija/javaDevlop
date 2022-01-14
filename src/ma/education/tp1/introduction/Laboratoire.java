package ma.education.tp1.introduction;

public class Laboratoire extends Salle {

	String type;
	
	public Laboratoire(String nom) {
		
		super(nom);
	}
	
	public Laboratoire(long id,String nom,String type) {
		super(id,nom);
		this.type=type;

	}
	
}
