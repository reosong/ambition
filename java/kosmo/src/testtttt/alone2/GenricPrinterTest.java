package testtttt.alone2;

public class GenricPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> pow = new GenericPrinter<Powder>();
		
		pow.setMaterial(new Powder());
		Powder powder111 = pow.getMaterial();
		System.out.println(pow);
		
		
		
		GenericPrinter<Plastic> pla = new GenericPrinter<Plastic>();
		
		pla.setMaterial(new Plastic());
		// T marterial = new Plastic();
		
		Plastic plastic = pla.getMaterial();
		System.out.println(pla);
		plastic.doPringting();
		
		
		
		
		
		
		
		
	}

}
