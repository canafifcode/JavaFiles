public abstract class Person {
    private String name;
    private int age;
    private String gender;
    private String contactInfo; //email

    public Person(String name, int age, String gender, String contactInfo){
        this.age=age;
        this.contactInfo=contactInfo;
        this.gender=gender;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    //abstract method
    public abstract void showInfo();
}
