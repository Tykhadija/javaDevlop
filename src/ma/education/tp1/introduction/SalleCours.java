package ma.education.tp1.introduction;

public class SalleCours extends Salle{

	long NbrPlace;
	
	public SalleCours(String nom) {
		
		super(nom);
	}
	 
	public SalleCours(long id,String nom,long i) {
		
		super(id,nom);
		this.NbrPlace=i;
	}
	
}
