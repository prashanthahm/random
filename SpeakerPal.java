class SpeakerPal {

	public static void main(String[] args) {
		
		Speaker Speaker=new Speaker();
		Speaker.brand="sony";
		Speaker.type="wood";
		Speaker.colour="red";
		Speaker.price=9779;
		
		System.out.println("Speaker brand ::"+Speaker.brand);
		System.out.println("Speaker type ::"+Speaker.type);
		System.out.println("Speaker  colour::"+Speaker.colour);
		System.out.println("Speaker price ::"+Speaker.price);
		
		Speaker Speaker1=new Speaker();
		Speaker1.brand="boat";
		Speaker1.type="wood";
		Speaker1.colour="blue";
		Speaker1.price=9000;
		
		System.out.println("Speaker brand ::"+Speaker1.brand);
		System.out.println("Speaker type ::"+Speaker1.type);
		System.out.println("Speaker  colour::"+Speaker1.colour);
		System.out.println("Speaker price ::"+Speaker1.price);
		
		Speaker Speaker2=new Speaker();
		Speaker2.brand="philps";
		Speaker2.type="PVC";
		Speaker2.colour="green";
		Speaker2.price=9779;
		
		System.out.println("Speaker brand ::"+Speaker2.brand);
		System.out.println("Speaker type ::"+Speaker2.type);
		System.out.println("Speaker  colour::"+Speaker2.colour);
		System.out.println("Speaker price ::"+Speaker2.price);
		
		Speaker Speaker3=new Speaker("carrumKing","wood");
		Speaker3.colour="bosse";
		Speaker3.price=8888;
		
		System.out.println("Speaker brand ::"+Speaker3.brand);
		System.out.println("Speaker type ::"+Speaker3.type);
		System.out.println("Speaker  colour::"+Speaker3.colour);
		System.out.println("Speaker price ::"+Speaker3.price);
		
		Speaker Speaker4=new Speaker("carrumKing","PVC");
		Speaker4.colour="realme";
		Speaker4.price=9999;
		
		System.out.println("Speaker brand ::"+Speaker4.brand);
		System.out.println("Speaker type ::"+Speaker4.type);
		System.out.println("Speaker  colour::"+Speaker4.colour);
		System.out.println("Speaker price ::"+Speaker4.price);
	}

	}