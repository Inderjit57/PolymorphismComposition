package Amazon;

import GasStattion.FillTank;

public class DeliveryMainClass {

	public static void main(String[] args) {

		ParcelDelivery parcelDelivery = new ParcelDelivery();
		
		//Overloading
		parcelDelivery.getNoofParcels(10);
		parcelDelivery.getNoofParcels(50, 60);
		parcelDelivery.getNoofParcels(10.32, 460, 12.3f);
		
		
		//Overriding
		ParcelPacking parcelPacking = new ParcelPacking();
		parcelPacking.parcelName();
		
		//Importing Variable from Package- Fill tank
		FillTank fillTank = new FillTank();
		System.out.println("Imporitng public variable - gastype3 from Package name- FillTank " +fillTank.gasType3);
		System.out.println("Imporitng protected variable- gastype2 from Package name- FillTank using getter " +fillTank.getGasType2());
		
		
	}

}
