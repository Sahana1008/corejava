class Hospital
{
	public static double getMadicine(String name)
	{
		System.out.println("running getMadicine in Hospital");
		System.out.println("name" +name);
		if(name=="avastin")
		{
			return 33863.00;
		}
		if(name=="actrorise")
		{
			return 2928.00;
		}
		if(name=="azel")
		{
			return 8700.00;
		}
		System.out.println("not found");
		return 0;
	}
	public static String getSymptom(String disease)
	{
		System.out.println("running getMadicine in Hospital");
		System.out.println("disease" +disease);
		if(disease=="cold")
		{
			return "coldact";
		}
		if(disease=="cough")
		{
			return "dextromethrophan";
		}
		if(disease=="fever")
		{
			return "paracetamol";
		}
		return "not found";
	}
	public static String getDoctor(String name)
	{
		System.out.println("running getMadicine in Hospital");
		System.out.println("name" +name);
		if(name=="dr.arcnaKucheri")
		{
			return "10.30am";
		}
		if(name=="dr.RPSMakkar")
		{
			return "1.00pm";
		}
		if(name=="dr.yogeshJain")
		{
			return "5:30pm";
		}
		return "not found";
	}
}