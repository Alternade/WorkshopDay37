package Workshop;

public class CreateList {
	private String FirstName;
    private String LastName;
    private String Address;
    private int Zip;
    private String City;
    private String State;
    private int PhoneNumber;
    private String Email;

    public CreateList(String FirstName, String LastName, String Address, String City, int Zip,
                           String State, int PhoneNumber, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Zip = Zip;
        this.City = City;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }


    public void details(){
        System.out.println("Firstname : " + FirstName);
        System.out.println("Lastname : " + LastName);
        System.out.println("Address : " + Address);
        System.out.println("City : " + City);
        System.out.println("State : " + State);
        System.out.println("Zip : " + Zip);
        System.out.println("PhoneNumber : " + PhoneNumber);
        System.out.println("Email : " + Email);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        CreateList contacts = new CreateList("Arpit", "Sahu", "GND",
                "Mumbai", 123456,"Maharashtra",1234567890,"Test@gmail.com");
        contacts.details();
    }
}



