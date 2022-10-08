package YouTubeDemoApp;

import YouTubeDemoApp.credits.MilitaryCreditManager;
import YouTubeDemoApp.credits.TeacherCreditManager;
import YouTubeDemoApp.credits.CarCreditManager;

public class Main {

	public static void main(String[] args) 
	{
		//IoC Container ile de yapılandırılabiliyor.
        CustomerManager customerManager = 
                new CustomerManager(new Customer(),new TeacherCreditManager());
            customerManager.GiveCredit();

//		CreditManager creditManager = new CreditManager(); // Referans oluşturuluyor.
//		creditManager.Calculate(); // Referans ile operasyonlar çağırılıyor.
//		creditManager.Calculate();
//		creditManager.Save();
//
//		Customer customer = new Customer(); // örneği oluşturuluyor. Instance creation
//		customer.Id = 1; // Değerler giriliyor.
//		customer.City = "Ankara";
//		
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.Delete();
//		customerManager.Save();
//
//
//		Company company = new Company();
//		company.TaxNumber = "100000";
//		company.CompanyName = "Arçelik";
//		company.Id = 100;
//       
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//		
//      Person person = new Person();
//      person.FirstName = "";
//      person.LastName = "";
//      person.NationalIdentity = "";
//        
//        
//      Customer c1 = new Customer();
//      Customer c2 = new Person();     // Referans alarak birbirinin yerini tutuyorlar.
//      Customer c3 = new Company();    // Referans alarak birbirinin yerini tutuyorlar.
	}

}
