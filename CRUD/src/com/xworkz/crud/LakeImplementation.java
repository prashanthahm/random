package com.xworkz.crud;

public class LakeImplementation implements LakesDAO  {

	 private String[] lakesNames=new String[10];
	  int index=0;
	@Override
	public boolean save(String lakeName) {
		if(this.index<this.lakesNames.length ) {

		if(this.lakesNames[this.index]==null) {
			this.lakesNames[this.index]=lakeName;
			
			this.index++;
			return true;
		}else {
			System.out.println("data not saved");
			}
		}

		return false;
	}

	@Override
	public void printAllLakes() {
		for (int i = 0; i < lakesNames.length; i++) {
			System.out.println(this.lakesNames[i]);
		}

	}

	@Override
	public boolean updateByIndex(String newlake, int index) {
		this.lakesNames[this.index]=newlake;
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		this.lakesNames[this.index]=null;
		return true;
	}

	@Override
	public boolean updateByName(String name, String newName) {
		if(this.lakesNames[this.index]==null) {
					this.lakesNames[this.index]=name;
					this.lakesNames[this.index]=newName;
					
					System.out.println("update by name is succefully done");
					this.index++;
					return true;
			}else {
				System.out.println("not updated by name and new name");
				return false;
			}
		
		
	}

	@Override
	public boolean deleteByName(String name) {
	
				if(this.lakesNames[this.index]==null) {
					this.lakesNames[this.index]=name;
					
				
				System.out.println("deleted by name is succefully done");
				this.index++;
				return true;
			}else {
				System.out.println("not deletd by name and new name");
				return false;
			}
		
		
	}

}
