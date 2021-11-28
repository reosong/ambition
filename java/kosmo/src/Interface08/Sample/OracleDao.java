package Interface08.Sample;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("a");
		
	}

	@Override
	public void insert() {
		System.out.println("b");		
	}

	@Override
	public void update() {
		System.out.println("c");		
	}

	@Override
	public void delete() {
		System.out.println("d");		
	}
	

}
