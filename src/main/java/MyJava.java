import java.util.Arrays;

public class MyJava implements MyInterface{

    public static void main(String[] args) {
        System.out.println("args = " + sampleVar );;
        MyJava myJava = new MyJava();
        myJava.printMe();
    }

    @Override
    public void printMe() {
        System.out.println("inside printMe()");
        System.out.println("sampleVar=" + sampleVar);
    }
}
