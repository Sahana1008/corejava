class BookRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main method");
		String country=Book.getCode(91);
		System.out.println("country:" +country);
		country=Book.getCode(86);
		System.out.println("country:" +country);
		country=Book.getCode(61);
		System.out.println("country:" +country);
		country=Book.getCode(81);
		System.out.println("country:" +country);
		country=Book.getCode(93);
		System.out.println("country:" +country);
		double cost=Book.getItem("iceCream");
		System.out.println("cost:" +cost);
	    cost=Book.getItem("chacolate");
		System.out.println("cost:" +cost);
	    cost=Book.getItem("cake");
		System.out.println("cost:" +cost);
	    cost=Book.getItem("pizza");
		System.out.println("cost:" +cost);
		cost=Book.getItem("panipuri");
		System.out.println("cost:" +cost);
		String movie=Book.getMovie("kantar");
		System.out.println("movie:" +movie);
		movie=Book.getMovie("charlie");
		System.out.println("movie:" +movie);
		movie=Book.getMovie("badManners");
		System.out.println("movie:" +movie);
		movie=Book.getMovie("KGF");
		System.out.println("movie:" +movie);
		movie=Book.getMovie("Upendra");
		System.out.println("movie:" +movie);
		
		
		System.out.println("-------------------------");
		System.out.println("running main method");
		double name =Hospital.getMadicine("avastin");
		System.out.println("name:" +name);
		name=Hospital.getMadicine("actrorise");
		name=Hospital.getMadicine("azel");
		
		String ref1=Hospital.getSymptom("cold");
		System.out.println("ref1" +ref1);
		ref1=Hospital.getSymptom("cough");
		System.out.println("ref1" +ref1);
		ref1=Hospital.getSymptom("fever");
		System.out.println("ref1" +ref1);
		
		String ref2=Hospital.getDoctor("dr.arcnaKucheri");
		System.out.println("ref2" +ref2);
		ref2=Hospital.getDoctor("dr.RPSMakkar");
		System.out.println("ref2" +ref2);
		ref2=Hospital.getDoctor("dr.yogeshJain");
		System.out.println("ref2" +ref2);
	}
}