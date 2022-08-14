package day30_inheritance.phoneTask;

public class IPhone extends Phone { //IPhone is a Phone

    public IPhone(String model, String size, String color, double price){
      super("Apple", model, size, color, price);
    }
    public static boolean hasApplePay=true;

    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is face timing with "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getModel()+" is face timing with "+email);
    }

}
/*
2. Create the following subclasses of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTime(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()
 */
