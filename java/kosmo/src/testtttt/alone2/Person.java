package testtttt.alone2;

public class Person{
	int age;
	String name;
	boolean marry;
	int child;

	public static void main(String[] args) {
		Person james = new Person();
		
		char[] al = new char[26];
		char a = 'A';
		for(int i = 0; i<al.length; i++, a++) {
			al[i] = a;
			
		}
		System.out.println(al[10]);
	
	}

}
