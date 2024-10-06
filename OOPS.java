public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();//created a pen object called p1.
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        Student s1 = new Student("Anirudh Sneh");
        System.out.println(s1.Name);
        Student s2 = new Student();//if we remove student()constructor then this line will give error because now java will not make a default constructor,it only makes a default constructor when no other constructor is made.
        System.out.println(s2);
        Student s3 = new Student(123);
        System.out.println(s3.RollNo);
        //Student s4 = new Student("Anirudh",123);will give an error because no such type of constructor exist.
        Student s4 = new Student();
        s4.Name = "Anirudh";
        s4.RollNo = 456;
        s4.password = "abcd";
        s4.marks[0] = 100;
        s4.marks[1] = 90;
        s4.marks[2] = 80;

        Student s5 = new Student(s4);
        s5.password = "xyz";
        s4.marks[2] = 87;//Even though we have copied properties of s4 in s5 previously,this line will still change the marks in s5 beacuse of shallow copy constructor but not in the case of Deep copy constructor.
        for(int i=0 ;i<3 ; i++){
            System.out.println(s5.marks[i]);
        }
        Fish Shark = new Fish();
        Shark.eat();

        Calci Cal = new Calci();
        System.out.println(Cal.sum(2,3));
        System.out.println(Cal.sum((float)1.7,(float)2.1));
        System.out.println(Cal.sum(1,2,3));

        horse H = new horse();
        H.eat();
        Ghoda G = new Ghoda();
        G.walk();
        //Pashu P = new Pashu();cannot create an instance of abstract class.
        Queen Q = new Queen();
        Q.moves();
        Bear B = new Bear();
        B.eat();

    }
}

class Pen{
    private String color;
    private int tip;
    
    String getColor(){//getter.
        return this.color;//this keyword is used to refer to current object.
    }
    int getTip(){//getter.
        return this.tip;
    }
    void setColor(String newcolor){//setter.
        color = newcolor;
    }
    void setTip(int newTip){//setter.
        tip = newTip;
    }
}

    class Student{
    String Name;
    int RollNo;
    String password;
    int marks[];
    Student(){//Non-Parameterized constructor.
        marks = new int[3];
        System.out.println("Constructor is called..");
    }
    Student(String name){//Parametrized constructor.
        marks = new int[3];
        this.Name = name;
        System.out.println("My Name is ");
    }
    Student(int roll){
        marks = new int[3];
        this.RollNo = roll;
    }
    /*Student(Student s1){//copy constructor;Shallow Copy Constructor.
        marks = new int[3];
        this.Name = s1.Name;
        this.RollNo = s1.RollNo;
        this.marks = s1.marks;
    }*/
    Student(Student s1){//Deep copy constructor.
        marks = new int[3];
        this.Name = s1.Name;
        this.RollNo = s1.RollNo;
        for(int i=0; i<marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
    }//There are no destructors in java like in C++,because the work of destructor is done by the in built garbage collector,which checks the part of code which is not required and puts it in garbage collector.
    }
    class Animal{//Base Class; Inheritance
        String color;

        void eat(){
            System.out.println("Eats");
        }
        void breathe(){
            System.out.println("Breathes");
        }

    }
    class Fish extends Animal{//Derived class OR Subclass.Single Inheritance.
        int fins;

        void swim(){
            System.out.println("Swims in Water");
        }
    }
    class Tuna extends Fish{//MultiLevelInheritance.
        void swim(){
            System.out.println("Swims");
        }
    }
    class Birds extends Animal{//Heirarchial Inheritnace.
        void fly(){
            System.out.println(("Fly"));
        }
    }

    class Calci{//Method overloading [CompileTime Polymorphism]
        int sum(int a , int b){
            return a+b;
        }
        float sum(float a , float b){
            return a+b;
        }
        int sum(int a , int b , int c){
            return a+b+c;
        }
    }
    class Cattle{//Parent class
        void eat(){
            System.out.println("Eats anything.");
        }
    }
    class horse extends Cattle{//Method overriding-->Parent class and child class contain same function with different definition.
        void eat(){
            System.out.println("Eats grass");
        }
    }
    abstract class Pashu{//Abstract class
        void eat(){
            System.out.println("Pashu eats");
        }
        abstract void walk();
    }
    class Ghoda extends Pashu{
        void walk(){
            System.out.println("Walks on 4 legs");
        }
    }
    
    interface ChessPlayer{
        void moves();
    }
    class Queen implements ChessPlayer{
        public void moves(){
            System.out.println("up,down,left,right,diagonal(in all four directions)");
        }
    }
    class Rook implements ChessPlayer{
        public void moves(){
            System.out.println("up,down,left,right");
        }
    }
    interface Herbivore{
        void eat();
    }
    interface Carnivore{
        void eat();
    }
    class Bear implements Herbivore,Carnivore{//Multiple Inheritance.
        public void eat(){
            System.out.println("Eats Plant based as well as meat.");
        }
    }

//In java No Class can be declared private or protected.