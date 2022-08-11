class PhotoFramePal
{
	public static void main(String[] args)
	{
		PhotoFrame photoframe=new PhotoFrame(8,250,"Square");
		
		FrameColors[] wall={FrameColors.BLACK,FrameColors.BROWN,FrameColors.BLUE,FrameColors.WHITE};
		
		photoframe.setPhotoFrame(PFrame.WOOD,wall,8);
		
		photoframe.printdata();
	}
}
