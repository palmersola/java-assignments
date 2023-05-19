package exceptions.handleExceptions;



public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null ||  name.length() > 40 || name.isEmpty()){
            throw new IllegalArgumentException("Name must be less than 40 characters long");
        }
        this.name = name;
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age must be over 0 and under 120 years old.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}