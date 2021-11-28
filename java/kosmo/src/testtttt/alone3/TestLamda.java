package testtttt.alone3;

interface PrintString{
	void show(String str);
	
	
}



public class TestLamda {

	public static void main(String[] args) {
		PrintString str = s-> System.out.println(s+"world");
		
	str.show("hello_lamda");
	showMy(str);
		
	}
		public static void showMy(PrintString abc) {
			abc.show("my");
		}
		
		
		
		
	

}
