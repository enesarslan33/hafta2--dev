
public class Main {

	public static void main(String[] args) {
		EmailLogger emaillogger=new EmailLogger();
		emaillogger.Log("Log Mesajı");
		FileLogger filelogger=new FileLogger();
		filelogger.Log("sefa");
		
		
		CustomerManager customermanager=new CustomerManager(new DatabaseLogger());
		customermanager.add();

	}

}
