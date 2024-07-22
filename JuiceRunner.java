class JuiceRunner
{
	public static void main(String[] args)
	{
		if(args.length==4)
		{
			String name=args[0];
			String brand=args[1];
			String flevour=args[2];
			String price=args[3];
			String quantity=args[4];
			float covertedPrice = Float.parseFloat(price);
			int covertedQuantity = Integer.parseInt(quantity);
			Juice.info(name,brand,flevour,covertedPrice,covertedQuantity);
		}
	}
}