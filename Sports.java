class Sports{
	public static void soccer(){
		System.out.println("soccer");
	}
	public static void tennis(){
		System.out.println("tennis");
		soccer();
		cricket();
		swimming();
		boxing();
	}
	public static void cricket(){
		System.out.println("cricket");
	}
	public static void swimming(){
		System.out.println("swimming");
	}
	public static void boxing(){
		System.out.println("boxing");
	}
}