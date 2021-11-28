package Inheritance07.lab11_instanceof;


class Weapon{

	protected int fire() {
		return 1;		//무기의 레벨 , 기본적으로 무기는 한명만 살상할수있습니다. 
	}
}
class Cannon extends Weapon{		//대포 무기 살상레벨 열명 가능 
	@Override
	protected int fire() {
		return 10;
	}
	protected void info() {
		System.out.println("대포는 살상능력이 큽니다. ");
	}
	
}
public class Overriding {
	

	public static void main(String[] args) {
		Weapon w;
		w= new Weapon ();
		System.out.println("기본 살상능력은 "+ w.fire());

		
		w = new Cannon(); 		//업캐스팅 
		System.out.println(w.fire());
		
		
		Cannon c = (Cannon) w;		//다운캐스팅 
		
		c.info();
		
		
		
		
		Weapon w = new Weapon();
		
		
	}

}
