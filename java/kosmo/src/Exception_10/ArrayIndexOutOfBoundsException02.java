package Exception_10;

public class ArrayIndexOutOfBoundsException02 {

	public static void main(String[] args) {
		

		String data1 = args[0];
		String data2 = args[1];
		
		try{
		System.out.println("args[0]"+data1);
		System.out.println("args[1]"+ data2);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("발동!");
			
		}
		System.out.println("프로그램 종료 ");
		
		
		
		
		
		
	}

}
