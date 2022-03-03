package GasStattion;

public class FillTank {

	FillTire fillTire = new FillTire();
	FillWasherFluid fillWasherFluid = new FillWasherFluid();

	public FillTire getFillTire() {
		return fillTire;
	}

	public FillWasherFluid getFillWasherFluid() {
		return fillWasherFluid;
	}

	private String gasType1 = "87 - Regular";
	protected String gasType2 = "89 - Mid grade";
	public String gasType3 = "91 - Supreme";
	double regularGasAmount = 1.57;
	double midGradeGasAmount = 1.68;

	public String getGasType1() {
		return gasType1;
	}

	public String getGasType2() {
		return gasType2;
	}

}
