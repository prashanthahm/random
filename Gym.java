class Gym{
	
	String name;
	double fees;
	String[] equipments;
	Trainer trainer;
	
	Gym(String name,double fees,String[] equipments)
	{
		this.name=name;
		this.fees=fees;
		this.equipments=equipments;
		
	}
	
	void setTrainer(Trainer trainer)
	{
		this.trainer=trainer;
		
	}
	void details()
	{
		System.out.println(this.name);
		System.out.println(this.fees);
		for(int eqt=0; eqt<this.equipments.length; eqt++)
		{
			System.out.println(this.equipments[eqt]);
		}
		trainer.printDatas();
	}
}