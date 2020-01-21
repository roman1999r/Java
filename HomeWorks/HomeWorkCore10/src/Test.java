public class Test {

    private String name;
    private int age;
    private String secondName;
    private int number;

    public Test(String name, int age, String secondName, int number) {
        this.name = name;
        this.age = age;
        this.secondName = secondName;
        this.number = number;
    }


    public void bio(){
        System.out.println("Name: " + name + ". Second name: " + secondName + ". Age: " + age + ". Number: " + number );
    }

}
