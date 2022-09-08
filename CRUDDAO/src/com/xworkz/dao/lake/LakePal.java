package com.xworkz.dao.lake;

public class LakePal {

	public static void main(String[] args) {
		
		LakeDAOImplementor lakeDAOImplementor = new LakeDAOImplementor();
		
		
		lakeDAOImplementor.save("Mathikere");
		lakeDAOImplementor.save("yeshwanthpurlake");
		lakeDAOImplementor.save("Btm lake");
		lakeDAOImplementor.save("ulsoor lake");
		lakeDAOImplementor.save("Agara lake");
		lakeDAOImplementor.save("kunigal lake");
		lakeDAOImplementor.save("hoskotelake");
		lakeDAOImplementor.save("Begur lake");
		lakeDAOImplementor.save("Madiwala lake");
		lakeDAOImplementor.save("hebbal lake");
		
		lakeDAOImplementor.printAllLakes();
		
		System.out.println("lakes name deleting =============================");
		
		lakeDAOImplementor.delete(3);
		lakeDAOImplementor.delete(7);
		lakeDAOImplementor.delete(9);

		lakeDAOImplementor.printAllLakes();
		
		System.out.println("lakes name updating after delete=================");

		lakeDAOImplementor.update(3,"Kengeri lake");
		lakeDAOImplementor.update(7,"Ragi kere");
		lakeDAOImplementor.update(9,"Durga kere");

		lakeDAOImplementor.printAllLakes();
		

		
	}

}
