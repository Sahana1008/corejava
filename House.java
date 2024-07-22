class House{
	public static void watch(String location)
	{
		System.out.println("watch method in class house");
		Dog.guarding(location);
		System.out.println("location:"+location);
	}
}