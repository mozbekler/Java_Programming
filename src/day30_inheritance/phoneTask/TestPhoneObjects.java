package day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        IPhone iPhone=new IPhone("IPhone 12","Large","Black",1000.5);

        Samsung samsung = new Samsung("Galaxy S22","Medium","White",1100);

        Nokia nokia = new Nokia("Brick","Small","Pink",50);

        iPhone.call(911);
        samsung.call(911);
        nokia.call(911);

        iPhone.faceTime(123456789);

        samsung.freeze();

        nokia.selfDefense();

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);












    }
}
