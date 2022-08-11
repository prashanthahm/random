class CarromBoardPal {

	public static void main(String[] args) {
		CarromBoard carromBoard=new CarromBoard();
		carromBoard.brand="carrumKing";
		carromBoard.type="wood";
		carromBoard.size='m';
		carromBoard.price=9779;
		
		System.out.println(carromBoard.brand);
		System.out.println(carromBoard.type);
		System.out.println(carromBoard.size);
		System.out.println(carromBoard.price);
		
		CarromBoard carromBoard1=new CarromBoard();
		carromBoard1.brand="P22King";
		carromBoard1.type="wood";
		carromBoard1.size='m';
		carromBoard1.price=9000;
		
		System.out.println(carromBoard1.brand);
		System.out.println(carromBoard1.type);
		System.out.println(carromBoard1.size);
		System.out.println(carromBoard1.price);
		
		CarromBoard carromBoard2=new CarromBoard();
		carromBoard2.brand="carrumKing";
		carromBoard2.type="wood";
		carromBoard2.size='s';
		carromBoard2.price=9779;
		
		System.out.println(carromBoard2.brand);
		System.out.println(carromBoard2.type);
		System.out.println(carromBoard2.size);
		System.out.println(carromBoard2.price);
		
		CarromBoard carromBoard3=new CarromBoard("carrumKing","wood");
		carromBoard3.size='l';
		carromBoard3.price=8888;
		
		System.out.println(carromBoard3.brand);
		System.out.println(carromBoard3.type);
		System.out.println(carromBoard3.size);
		System.out.println(carromBoard3.price);
		
		CarromBoard carromBoard4=new CarromBoard("carrumKing","wood");
		carromBoard4.size='x';
		carromBoard4.price=9999;
		
		System.out.println(carromBoard4.brand);
		System.out.println(carromBoard4.type);
		System.out.println(carromBoard4.size);
		System.out.println(carromBoard4.price);
	}

}