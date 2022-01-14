package ma.education.tp5.collections;

public class Client implements Comparable{

	Integer code;
	String name;
	
	public Client(Integer code,String name) {
		this.code = code;
		this.name = name;
	}
	
	@Override
	public String toString(){
		return " Code : " + code +" , name : " +name;
	}
	
	@Override
	public boolean equals(Object o) {
		Client cli = (Client) o; 
		return this.code == cli.code && this.name.equals(cli.name);
	}
	
	@Override
	public int hashCode() {
		return code;
	}
	
	@Override
	public int compareTo(Object o) {
		 Client cli = (Client)o;
		 //return -cli.code + this.code;
		 return -this.name.compareTo(cli.name);
	}
	
}
