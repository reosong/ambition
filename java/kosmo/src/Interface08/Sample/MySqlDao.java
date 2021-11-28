package Interface08.Sample;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("1");		
	}

	@Override
	public void insert() {
		System.out.println("2");		
	}

	@Override
	public void update() {
		System.out.println("3");		
	}

	@Override
	public void delete() {
		System.out.println("4 ");		
	}
	
	
	
	

}
