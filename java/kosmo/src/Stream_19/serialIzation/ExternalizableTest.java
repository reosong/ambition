package Stream_19.serialIzation;

import java.io.*;

//exteranlizable :세부적인 컨트롤을 하면서 직열화 가능(메소드 제공)


class Dog implements Externalizable {
	String name;
	int age;
	
	public Dog() {}
	public Dog(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return name+age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);		//출력시 호출되는 메소드 
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF(); //인풋시 호출되는 메소드 
		age = in.readInt();
		
	}
}
public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		
		Dog cuteReo = new Dog("reo",1);
		Dog yourDog = new Dog("dubu",4);
		
		FileOutputStream fis = new FileOutputStream ("Users\\ys\\dog.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		
		oos.writeObject(cuteReo);
		oos.writeObject(yourDog);
		
		System.out.println("성공띠 ");
		

		
		
		
	}

}
