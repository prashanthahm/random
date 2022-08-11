class PhotoFrame
{
	int size;
	int price;
	String shape;
	PFrame material;
	FrameColors[] color;
	double warranty;
	
	PhotoFrame(int size,int price,String shape)
	{
		this.size=size;
		this.price=price;
		this.shape=shape;
	}
	
	void setPhotoFrame(PFrame material,FrameColors[] color,double warranty)
	{
		this.material=material;
		this.color=color;
		this.warranty=warranty;
	}
	
	void printdata()
	{
		System.out.println(this.size);
		System.out.println(this.price);
		System.out.println(this.shape);
		System.out.println(this.material);
		
		for(int b=0; b<this.color.length; b++)
		{
			System.out.println(this.color[b]);
		}
		
		System.out.println(this.warranty);
	}
}