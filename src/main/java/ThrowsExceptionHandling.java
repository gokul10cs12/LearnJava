import java.io.IOException;

public class ThrowsExceptionHandling {

    void testException() throws IOException{
        System.out.println("inside the exception class going to  throw the exception");
        throw new IOException("this is a tes for THROWS Statement");
    }
}
