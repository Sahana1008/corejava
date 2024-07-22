class Names{
	public static void aruna(){
		System.out.println("Aruna");
		sahana();
	}
	public static void sahana(){
		System.out.println("Sahana");
		aruna();
	}
	public static void main(String[] args){
		System.out.println("names are");
		sahana();
		aruna();
	}
}