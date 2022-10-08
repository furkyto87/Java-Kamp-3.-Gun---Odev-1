package YouTubeDemoApp.credits;

public abstract class BaseCreditManager implements ICreditManager
{																  
	// Tamamlanmamış yani içi boş
	// Kullanıldığı sınıflarda farklı operasyonlar yapılabilir.
	@Override
	public abstract void calculate();
	
	// Tamamlanmış ve içi doldurulmuş metodlar yazılabilir.
	@Override
	public void save() 
	{
		System.out.println("Kaydedildi");
	}
	
}
