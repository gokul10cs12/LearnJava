public interface MyInterface {
    int sampleVar = 50;
    void printMe();

    default void testDefaultImplementation(){
        System.out.println("this is a default implementation of the class");
    }
}
