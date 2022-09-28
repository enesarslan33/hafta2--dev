package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerManager customermanager=new CustomerManager(new OracleCustomerDal());
		customermanager.customer=new OracleCustomerDal();
		customermanager.add();
		
		AccessCustomerDal access=new AccessCustomerDal();
		access.customerdal=new AccessCustomerDal();
		access.add();
	}

}
