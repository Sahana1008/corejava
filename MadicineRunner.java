class MadicineRunner
{
	public static void main(String[] args)
	{
		if(args.length==4)
		{
			String name=args[0];
			String manfDate=args[1];
			String price=args[2];
			String quantity=args[3];
			float covertedPrice = Float.parseFloat(price);
			int covertedQuantity = Integer.parseInt(quantity);
			Madicine.info(name,manfDate,covertedPrice,covertedQuantity);
		}
	}
}