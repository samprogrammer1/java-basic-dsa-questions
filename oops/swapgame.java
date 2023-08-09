public class swapgame {
    public static class Person{
        int age ;
        String name;

        void sysHey(){
            System.out.println(name + "[" + age + "] says hi");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=25;
        p1.name="John";
        p1.sysHey();

        Person p2 = new Person();
        p2.age=10;
        p2.name="sam";
        p2.sysHey();

        swap(p1, p2);
        p1.sysHey();
        p2.sysHey();
    }

    public static void swap(Person p1 , Person p2){
        p1 = new Person();
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        p2 = new Person();
        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }
    
}