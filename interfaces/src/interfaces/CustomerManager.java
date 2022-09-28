package interfaces;
public class CustomerManager {
	ICustomerDal customer;
	public CustomerManager(ICustomerDal customerdal) {
		this.customer=customerdal;
	}
	public void add() {
		customer.add();
	}

}
