package adapterPattern;

import java.time.LocalDate;
import java.time.Period;

public class Adapter implements Student{

    Person person;
    LocalDate currentData = LocalDate.now();

    public Adapter(Person person) {
        this.person = person;
    }

    @Override
    public String getFullName() {
        return this.person.getFirst_name() + " " + this.person.getLast_name() ;
    }

    @Override
    public int getAge() {
        //Calculate the Age.
        LocalDate Dob = LocalDate.parse(person.getDob());
        return Period.between(Dob, currentData).getYears();
    }

    @Override
    public int getContactNumber() {
        return this.person.getPhone_number();
    }
}
