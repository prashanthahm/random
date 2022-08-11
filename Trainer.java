class Trainer{
	
 String name;
 long contactNo;
 double exp;
 Gender gender;
 int age;
 
 Trainer(String name,long contactNo,Gender gender, int age)
 {
	 this.name=name;
	 this.contactNo=contactNo;
	 this.gender=gender;
     this.age=age;
	
 }
 
 void setExp(double exp)
 {
	 this.exp=exp;
 }
 
void printDatas()
{
	System.out.println(this.name);
	System.out.println(this.contactNo);
	System.out.println(this.gender.actualValue);
	System.out.println(this.age);
}	
	
	
	
	
	
}