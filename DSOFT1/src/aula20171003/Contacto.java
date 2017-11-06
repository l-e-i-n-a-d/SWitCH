package aula20171003;


/**
 * Declares a simple POJO of a contact class and creates a contact object.
 */
public class Contacto {
	private String name;
	private String number;
	
	public Contacto() {
	}
	public Contacto(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contacto [name=" + name + ", number=" + number + "]";
	}
	
	public static void main(String[] args) {
		Contacto c1 = new Contacto();
		System.out.println(c1);
	}
}
