package Vista;

import java.rmi.RemoteException;
import java.util.Scanner;

import NET.webserviceX.www.Currency;
import NET.webserviceX.www.CurrencyConvertorSoap;
import NET.webserviceX.www.CurrencyConvertorSoapProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el monto que quiere convertir");
        int monto = sc.nextInt();
        		
		CurrencyConvertorSoapProxy conversor = new CurrencyConvertorSoapProxy();
		CurrencyConvertorSoap ccs = conversor.getCurrencyConvertorSoap();
	
		double conversionRate;
		
		try {
			conversionRate = ccs.conversionRate(Currency.CLP, Currency.USD);
			System.out.println(" "+ (monto*conversionRate));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
