import java.util.logging.Logger;

public class ExceptionHandling {

    void arithmeticException(){
        int a;
        try{
            a = 100/0;


        }
        catch (Exception e){
            System.out.println("exception ="+ e);
        }
        System.out.println("next line");
    }

    public void nullPointerException() {
        String a=null;
        try {
            System.out.println(a);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
