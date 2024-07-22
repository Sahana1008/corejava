class Country
{
	public static void states(String[] state)
	{
		System.out.println("Start state in country");
		for ( int name=0; name<state.length;name++)
		{
			String ref=state[name];
			System.out.println("states:"+ref);
		}
		System.out.println("End state in country");
		
	}
	public static void Pincode(String[] code)
	{
		System.out.println("Start pincode in country");
		for ( int pin=0; name<pin.length;pin++)
		{
			int var=code[pin];
			System.out.println("pincodes:"+var);
		}
		System.out.println("End pincode in country");
		
	}
	public static void Primeminister(String[] minister)
	{
		System.out.println("Start primeminister in country");
		for ( int prime=0; prime<pin.length;prime++)
		{
			String the=minister[prime];
			System.out.println("primeministers:"+the);
		}
		System.out.println("End primeminister in country");
	public static void cabinetMinister(String[] cabinetMinisters)
	{
		System.out.println("Start cabinetMinister in Country");
		for(int position=0;position<cabinetMinisters.length;position++)
		{
			String ref=cabinetMinisters[position];
			System.out.println("cabinetMinister:"+ref);
		}
		System.out.println("End cabinetMinister in Country");
			
	}
	
	public static void politicalPartie(String[] politicalParties)
	{
		System.out.println("Start politicalParties in Country");
		for(int position=0;position<politicalParties.length;position++)
		{
			String ref=politicalParties[position];
			System.out.println("politicalParties:"+ref);
		}
		System.out.println("End politicalParties in Country");
		
	}
}