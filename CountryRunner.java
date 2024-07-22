class CountryRunner
{
	public static void main(String[] args)
	{
		String[] stateName={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Maharashtra","Madhya Pradesh","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Telangana","Uttar Pradesh","Uttarakhand"};
		Country.states(stateName);
		int[] pinCodeName={"591111","591112","591113","591114","591115","591116","591117","591118","591119","591110"};
		Country.Pincode(pinCodeName);
		String[] PrimeMinister={"Narendra Modi","Rajnath Singh","Amit Shah","Nitin Gadkari","Nirmala Sitharaman","S. Jaishankar","Arjun Munda","Smriti Irani","Piyush Goyal","Dharmendra Pradhan","Pralhad Joshi","Narayan Tatu Rane","Sarbananda Sonowal","Mukhtar Abbas Naqvi","Virendra Kumar","Giriraj Singh","Jyotiraditya Scindia","Ramchandra Prasad Singh","Ashwini Vaishnaw","Pashupati Kumar Paras","Gajendra Singh Shekhawat","Kiren Rijiju","Raj Kumar Singh","Hardeep Singh Puri","Mansukh Mandaviya","Bhupender Yadav","Parshottam Rupala","G. Kishan Reddy","Anurag Thakur"};
        Country.Primeminister(PrimeMinister);
		String[] cabinetMinisters ={"Narendra Modi","Rajnath Singh","Amit Shah","Nitin Gadkari","Nirmala Sitharaman","S. Jaishankar","Arjun Munda","Smriti Irani","Piyush Goyal","Dharmendra Pradhan","Pralhad Joshi","Narayan Tatu Rane","Sarbananda Sonowal","Mukhtar Abbas Naqvi","Virendra Kumar","Giriraj Singh","Jyotiraditya Scindia","Ramchandra Prasad Singh","Ashwini Vaishnaw","Pashupati Kumar Paras","Gajendra Singh Shekhawat","Kiren Rijiju","Raj Kumar Singh","Hardeep Singh Puri","Mansukh Mandaviya","Bhupender Yadav","Parshottam Rupala","G. Kishan Reddy","Anurag Thakur"};
		Country.cabinetMinister(cabinetMinisters);
		String[] politicalParties ={"Indian National Congress","Bharatiya Janata Party","Janata Dal","Karnataka Congress Party","Bahujan Samaj Party"};
		Country.politicalPartie(politicalParties);
	}
}