package adapterPattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        //Set the information to the person
        person.setFirst_name("Nirmith");
        person.setLast_name("Akash");
        person.setDob("1999-05-08");
        person.setNIC("1139749302V");
        person.setPhone_number(98573393);

        //use an adapter to pass the person to the university student.
        Adapter adapter = new Adapter(person);

        //Create A University adapterPattern.Student using the adapterPattern.Adapter.
        UniversityStudent universityStudent = new UniversityStudent();
        universityStudent.setFull_name(adapter.getFullName());
        universityStudent.setAge(adapter.getAge());
        universityStudent.setPhone_number(adapter.getContactNumber());

        //Print the converted person into university student.
        System.out.println(universityStudent.getFullName());
        System.out.println(universityStudent.getAge());
        System.out.println(universityStudent.getContactNumber());

        /*
        * Common method are stored in the adapterPattern.Student interface.
        * */

    }
}
