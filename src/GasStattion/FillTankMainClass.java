package GasStattion;

public class FillTankMainClass {

	public static void main(String[] args) {

		FillTank fillTank = new FillTank();

		fillTank.getFillTire().setTirePressure(42);
		System.out.println(fillTank.getFillTire().getTirePressure());

		fillTank.getFillWasherFluid().setWasherFluidLevel("Medium");
		System.out.println(fillTank.getFillWasherFluid().getWasherFluidLevel());

//	System.out.println("Gastype2 is protected in FillTank. Can be directly accessed in MAinClass "+fillTank.gasType2);
//	System.out.println("GasType1 is Private in FillTank. accessed using Getter method" + fillTank.getGasType1());
//	
//	//FillWasherFluid fillWasherFluid = new FillWasherFluid();
//	System.out.println("Gastype2 is protected in FillTank. Can be accessed in FillWasherFluid and then called in Main" + fillTank.getGasType2());
//	
	}
}
