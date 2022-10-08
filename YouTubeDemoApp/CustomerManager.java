package YouTubeDemoApp;

import YouTubeDemoApp.credits.ICreditManager;

//Katmanlı Mimariler
public class CustomerManager 
{
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager)  // Constructor - Yapıcı Metod
    {
        this.customer = customer;
        this.creditManager = creditManager;
    }
	public void Save() // Müşteri nesnesini parametre olarak gönderiyoruz.
     {
         System.out.println("Müşteri kaydedildi : "); //+ this.customer.FirstName);
     }
    public void Delete() // Müşteri nesnesini parametre olarak gönderiyoruz.
    {
    	System.out.println("Müşteri silindi : "); //+ this.customer.FirstName);
    }
    
    public void GiveCredit()
    {
    	this.creditManager.calculate();
    	System.out.println("Kredi verildi");
    }
}
