package ProductStore;

interface Payables {
  void pay();
}
public class Payable{
	public static void main(String[]args) {
		Payables Employee=new Payables(){
			public void pay() {
				System.out.println("first anonymus class");
			}
		};
		Employee.pay();
		Payables Contractor = ()-> System.out.println("hjbhjgjh");
			
		Contractor.pay();
	}
}
