package ma.education.tp2.statickeyword;

public class TestStatic {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1,"Ammar",20);
		Etudiant e2 = new Etudiant(2,"Ahmed",30);

		System.out.println(" e1 id :" + e1.id + ", nom :"+e1.nom + " nbr Etudiant :"+ e1.nbEtudiants);	
		System.out.println(" e2 id :" + e2.id + ", nom :"+e2.nom + " nbr Etudiant :"+ e2.nbEtudiants);
		//la valeur de l’attribut static nbEtudiants sera prend la dernier valeur +
	}

}
