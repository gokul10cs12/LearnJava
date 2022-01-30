import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MyJava implements MyInterface{

    public static void main(String[] args) {

        int a = 22;
        int b = 223;
        int c = 222;

        /*
        Create model class
        * */
        MyModel Student1 = new MyModel("Gokul", 28, "Nandavilasam");
        MyModel Student2 = new MyModel("Sneha", 28, "Nandavilasam");
        MyModel Student3 = new MyModel("Neethu", 28, "Nandavilasam");

        MyModel student4 = new MyModel("Munna", 30, "Nandavilasam");

        System.out.println("args = " + sampleVar );
        MyJava myJava = new MyJava();
        myJava.printMe();
        myJava.testDefaultImplementation();

//        HashMap
        HashMap<String, MyModel> myHashMap = new HashMap<>();
        myHashMap.put("a", Student1);
        myHashMap.put("b", Student2);
        myHashMap.put("c", Student3);

        if(myHashMap.containsKey("a")){
            System.out.println("myHashMap key (a) value : " + myHashMap.get("a") );
        }
//         ArrayList Operations
        ArrayList<MyModel> list = new ArrayList<>();
        list.add(Student1);
        list.add(Student2);
        list.add(Student3);
        list.set(0,student4);

        System.out.println("before removal" + list);

        list.remove(0);
        System.out.println("after removal" + list);

    }

    @Override
    public void printMe() {
        System.out.println("inside printMe()");
        System.out.println("sampleVar=" + sampleVar);
    }
}
