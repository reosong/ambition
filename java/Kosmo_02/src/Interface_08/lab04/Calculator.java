package Interface_08.lab04;

public abstract class Calculator implements Clac {

	@Override
	public int add(int num1, int num2) {
				return num1+ num2;
	}

	@Override
	public int substract(int num1, int num2) {
				return num1-num2;
	}

	
}
