class GymTrainer{
	
	public static void main(String[] args)
	{
		String[] items={"Chest Press","Weightlifter","Plates","Bench Press"};
		Gym gym=new Gym("Taj",1000d,items);
		
		Trainer trainer=new Trainer("Power",9876543969,Gender.MALE,30);
		gym.setTrainer(trainer);
		
		gym.details();
	}
}