class DeliveryGuy{
	public static void deliver(String item){
		System.out.println("delivere method in Company class");
		DeliveryVehicle.deliver(item,"FIXED");
	}
}