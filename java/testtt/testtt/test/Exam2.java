package testtt.test;

public class Exam2 {

	public static void main(String[] args) {
		
	String arr[]= { "user12U", "user10A", "User010A", "USER02U", "TEST01U", "test012M", "Test1M", "test100A"};
		
	String arr1[] =  { "user12U", "user10A", "User010A", "USER02U", "TEST01U", "test012M", "Test1M", "test100A"};
	
	
	String aa = "test12a";
	String bb = "test00442a";
//	int aaa= Integer.parseInt(aa.substring(4,aa.length()));
//	int vvv= Integer.parseInt(bb.substring(4,bb.length()));
	String ab = aa.substring(0,4);
	String aaaa= aa.substring(4,aa.length()-1);
	String bbbb = bb.substring(4,bb.length()-1);
	System.out.println(aaaa);
	System.out.println(bbbb);
	
	System.out.println("======111");
	System.out.println(ab);

//	System.out.println(aaa);
//	System.out.println(vvv);
	System.out.println("======111");
	
	
	

		
		for(int i=0 ; i<arr.length-1;i++) {
			for(int a=i+1; a<arr.length;a++) {
				//a m u 정렬 
				if(arr[i].substring(arr[i].length()-1,arr[i].length()).compareTo(arr[a].substring(arr[a].length()-1,arr[a].length()))>0) {

					String str = arr[i];

					
					arr[i] = arr[a];
					arr[a] = str;
					//동일한 한 에서 문자열 비교 
				}if(arr[i].substring(arr[i].length()-1,arr[i].length()).compareTo(arr[a].substring(arr[a].length()-1,arr[a].length()))==0){
					String first= arr[i].substring(0,1).toLowerCase() ;
					String second = arr[a].substring(0,1).toLowerCase();
					if(first.compareTo(second)>0){
						String str = arr[i];

					
						arr[i] = arr[a];
						arr[a] = str;
						
					//번호 오름차순으로 정렬
				}else if(first.compareTo(second)==0) {
					
					int num1 =Integer.parseInt(arr[i].substring(4,arr[i].length()-1));
					int num2 =Integer.parseInt(arr[a].substring(4,arr[a].length()-1));
				
					if(num1 > num2) {
					String str1 = arr[i];
					arr[i] = arr[a];
					arr[a] =str1;
					}
					String top1 = arr[i].substring(0,4).toUpperCase();
					String top2 = arr[a].substring(0,4).toUpperCase();
				
					int count1 = 0;
					int count2 = 0;
					
					
					//원본 순서 정렬 
					if(top1.equals(top2)||(num1==num2)) {
						
						for(int c=0; c<arr1.length;c++) {
							if(arr1[c].equals(arr[i])) {
								 count1 = c;
							}
						}
						for(int c=0; c<arr1.length;c++) {
							if(arr1[c].equals(arr[a])) {
								count2 = c;
								
							}
						}
						if(count1<count2) {
							String str = arr[i];
							arr[i] = arr[a];
							arr[a] = str;
							
						}
						
					//	test100A user10A User010A Test1M test012M TEST01U USER02U user12U		
						
					}
					
					
					
					}
				
				}
			}
		
			
		}
		
	
		
		for(int n =0; n <arr.length;n++) {
			System.out.println(arr[n]);
			
		}

	}

}
