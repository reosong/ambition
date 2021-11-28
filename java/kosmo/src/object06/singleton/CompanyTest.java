package object06.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		//Company myCompany1 = new Company();// company() 생성자가 private 설정
											//외부 클래스에서 호출할 수 없다. 
		//Company mycompany2 = new Company();
		

		Company myCompany1 = Company.getinstance();
		Company myCompany2 = Company.getinstance();
		System.out.println(myCompany1==myCompany2);
		
		System.out.println(Company.getinstance());
		System.out.println(myCompany1);//객체 자신의 주소값(힙영역)출력 
		System.out.println(myCompany2);//
		
		
	}

}
