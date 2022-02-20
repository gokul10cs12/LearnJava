import java.util.*;
import java.util.stream.Collectors;

public class MyJava {

    public static void main(String[] args) {

        int a = 22;
        int b = 223;
        int c = 222;

        /*
        Create model class
        * */
        List<Person> personList = getPeople();

        List<Person> female = new ArrayList<>();

        for (Person person: personList) {
            if (person.getGender().equals(Gender.FEMALE)){
                female.add(person);
            }

        }

        /*
        *
        * java streams filter
        * */
        List<Person> females = personList.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE)).toList();

        /*
        * java streams sorte
        * */

        List<Person> femaleSorted = personList.stream().sorted(Comparator.comparing(Person::getAge)).toList();
        femaleSorted.forEach(System.out::println);

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
