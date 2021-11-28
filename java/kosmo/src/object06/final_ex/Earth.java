package object06.final_ex;

public class Earth {

	
	final static double EARTH_RADIUS =6400;		//지구의 반지름 
	static final double EARTH_SURFACE_AREA;		//지구의 표면적 
	//final이 들어가있는 상수들은 초기값이 설정되어 있어야함 
	
	static {// static의 상수의 표면적을 초기화 
		EARTH_SURFACE_AREA = 4* Math.PI* EARTH_RADIUS * EARTH_RADIUS;
	}
	
	
	//static final :모든 객체에서 참조할 경우 객체내부에 상수를 로드하지 않고 
	// 			stack 영역에 저장해서 모든 객체들이 공유해서 사용하도록 설정 
	
	
	
}
