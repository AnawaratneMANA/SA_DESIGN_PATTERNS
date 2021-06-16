package adapterPattern;

public class UniversityStudent implements Student{

    //Variables
    private String NIC;
    private String full_name;
    private int Age;
    private int phone_number;

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }


    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setAge(int age) {
        Age = age;
    }


    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String getFullName() {
        return full_name;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public int getContactNumber() {
        return phone_number;
    }
}
