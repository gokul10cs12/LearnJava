import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class MyJava {

    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);

        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
//        String orElse = optional.orElse("replaced string");  /* important dont remove */

      System.out.println( optional.orElseGet(() ->{
            return "opt";
        }));
        optional.ifPresent(System.out::println);

        optional.ifPresentOrElse(word ->{
            System.out.println("ifPresent");
        }, () -> System.out.println("elsPart"));


        Person person = new Person("myName", 21, Gender.MALE);
//        System.out.println(person.getName().toUpperCase());
        String name = person
                .getName()
                .map(String::toUpperCase)
                .orElse("no email found");
        System.out.println(name);

        /*Stream example*/

        // Here the map will take each object and selectively create object/list based on the function it;s applying.
        // in filters, it creates a new stream with filtered elements.
        // ------>revisit again.
/*
        List<EmpDept> emp = employeeList.stream()
                .map(e -> new EmpDept(e.getName(), e.getDept()))
                .collect(Collectors.toList());
   */
    }

    /*
    * Java streams declarative approach of the same solution above.
    * */

    private static List<Person> getPeople() {
        return List.of(
        new Person("Gokul", 1, Gender.MALE),
        new Person("abc", 11, Gender.FEMALE),
        new Person("cde", 22, Gender.MALE),
        new Person("ee", 21, Gender.MALE),
        new Person("er", 34, Gender.FEMALE),
        new Person("dc", 3, Gender.MALE),
        new Person("erw", 55, Gender.MALE),
        new Person("we", 13, Gender.FEMALE)
        );
    }


}
