package Stream_19.serialIzation;

import java.io.*;

class Animal implements Externalizable {
	
	String name;
	int age;

	public Animal() {}
	
	public Animal(String name, int age) {
		this.age =age;
		this.name = name;
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name= in.readUTF();
		age = in.readInt();
	}
	public String toString() {
		return name+" " + age;
	}
	
	
}
public class lab2_externalizable {

	public static void main(String[] args) throws IOException {
		

		
		Animal a = new Animal("사자 ", 10);
		Animal b = new Animal("호랑이 ", 20);
		Animal c = new Animal("치타  ", 40);
		FileOutputStream fos = new FileOutputStream("User\\ys\\animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.writeObject(b);
			oos.writeObject(c);
			
		
		System.out.println("성공띠~ ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
