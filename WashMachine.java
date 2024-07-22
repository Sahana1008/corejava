class WashMachine{
	public static void wash(){
		System.out.println("wash the cloths");
	}
	public static void makesNoise()
	{
		System.out.println("noise");
		WashMachine.shake();
		shake();
	}
	public static void shake()
	{
		System.out.println("shaking");
	}
}