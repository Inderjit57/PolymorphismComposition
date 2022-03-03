package Amazon;

public class ParcelDelivery {

	private String parcelName = "Bag of chips";

	// Method Overloading using different number of arguments and datatype
	public void getNoofParcels(int num) {
		System.out.println("Method1 " + num);
	}

	public void getNoofParcels(int num1, int num2) {
		System.out.println("Method overloaded with 2 arguments " + (num1 + num2));
	}

	public void getNoofParcels(double num1, int num2, float num3) {
		System.out.println("Method overloaded with 3 arguments " + (num1 + num2 + num3));
	}

	public String parcelName() {
		System.out.println("this method is in Parcel Delivery");
		return parcelName;
	}

}
