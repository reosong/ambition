package doit.array;

public class StudentAraay {

	public static void main(String[] args) {
		
		
		Student a[] = new Student[3];
		
		a[0]= new Student("a123","song");
		a[1] = new Student("b123","kim");
		a[2]= new Student("c123","park");
		
		
		for(int i =0; i<a.length; i++) {
		a[i].showInfo();
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
