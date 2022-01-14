package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ma.education.tp1.introduction.Salle;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Class tr = Salle.class;
		Field[] f =tr.getDeclaredFields();
		
		for(Field item : f) {
			System.out.println("AtributName: " +item.getName());
		}
		
		Method[] m =tr.getDeclaredMethods();
		
		for(Method item: m) {
			System.out.println("MethodName: " +item.getName());
		}
		
		Constructor[] constructors =tr.getConstructors();
		Salle o2 = (Salle)constructors[0].newInstance("Salle Informatique");
		o2.id = 2;
		Salle o3 = (Salle)constructors[1].newInstance("Salle des Cours", 2);
		System.out.println("Object 2 Name: "+o2.nom + " id: "+o2.id); 
		System.out.println("Object 3 Name: "+o3.nom + " id: "+o3.id);
		System.out.println(o2.equals(o3));
	}

}
