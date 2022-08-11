class ChairPal{
	
	public static void main(String [] arges){

Chair nand=new Chair();

System.out.println(nand.nameOfPlace);

System.out.println(nand.noofTrees);

System.out.println(nand.fee);

System.out.println("Re assigning=========================");

nand.nameOfPlace= "Park";
nand.noofTrees=270;
nand.fee=true;

System.out.println(nand.nameOfPlace);
System.out.println(nand.noofTrees);
System.out.println(nand.fee);


	}

}