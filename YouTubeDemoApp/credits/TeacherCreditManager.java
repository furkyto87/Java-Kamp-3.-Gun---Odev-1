package YouTubeDemoApp.credits;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager 
{
// BaseCreditManager'dan abstract metod ile aldığımız değeri üzerine yazdık
	@Override
	public void calculate() 
	{
		//Hesaplamalar
		System.out.println("Öğretmen kredisi hesaplandı");	
	}
	

// save() metodumuzu BaseCreditManager'dan miras aldık.
// Bu nedenle buradakini kaldırdık
	
//	@Override						
//	public void save() 				
//	{
//		System.out.println("Kaydedildi");	
//	}
	
	

}

	