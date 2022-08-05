public class encapsulation {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Robin Hood");
        person1.setAge(32);
        person1.setPhoneNumber("123398736");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getPhoneNumber());
    }
}
class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge (){
        return this.age;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}