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
        * java streams sorted
        * */

        List<Person> femaleSorted = personList
                .stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
                .toList();
        femaleSorted.forEach(System.out::println);

        /* allMatch
        * all match , to see conditional checks boolean , if all matches the condition provided.
        * */
        boolean oldAge = personList.stream().allMatch(person -> person.getAge() > 18);
        System.out.println("oldage->"+ oldAge);

        /* anyMatch
         * all match , to see conditional checks boolean , if any one matches the condition provided.
         * */
        boolean underAge = personList.stream().anyMatch(person -> person.getAge() < 18);
        System.out.println("under age->" + underAge);

        /* noneMatch
         * noneMatch , to see conditional checks boolean , if any one matches the condition provided.
         * */
        boolean noneMatch = personList.stream().noneMatch(person -> person.getAge() == 10);
        System.out.println("Nonematch age->" + noneMatch);

        /*
        * max
        * get the maximum value of the object
        * */
        Optional<Person> max = personList.stream().max(Comparator.comparing(Person::getAge));
            // or
        personList.stream().max(Comparator.comparing(Person::getAge)).ifPresent(person ->
                System.out.println("max aged person->"+ person) );
        /*
         * min
         * get the maximum value of the object
         * */
        personList.stream().min(Comparator.comparing(Person::getAge)).ifPresent(person ->
                System.out.println("min aged person->"+ person) );

    }

    /*
    * Java streams declarative approach of the same solution above.
    * */

    private static List<Person> getPeople() {
        return List.of(
        new Person("Gokul", 1, Gender.MALE),
        new Person("abc", 11, Gender.FEMALE),
        new Person("cde", 22, Gender.MALE),
        new Person("ee", 81, Gender.MALE),
        new Person("er", 34, Gender.FEMALE),
        new Person("dc", 3, Gender.MALE),
        new Person("erw", 55, Gender.MALE),
        new Person("we", 13, Gender.FEMALE)
        );
    }


}
