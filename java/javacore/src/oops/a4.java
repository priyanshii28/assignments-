package oops;

abstract class name {
    String name;
    name(String name){
        this.name =name;
    }
    public  abstract String getname();
    //Point 1 : here the method declared is abstract so the class should be abstract ;
}
    class person extends name{
        person(String name) {
            super(name);
        }
        @Override
        public  String getname(){
            return ("Hello,"+this.name);
        }
    }

    //point -3 :
//here if the class AbstClassP3ex isn't Abstract or else the methods of abstract class aren't
// overridden we would get a compile time error.
    abstract class MyClass {
        public abstract void display();
    }

    class  AbstClassP3ex extends MyClass{
        @Override
        public void display(){
            System.out.println("This is the subclass implementation of the display method ");
        }
    }

    //point -4 :
//here the class Myclass2 is Abstract & private, so it can't be used until its made default .
    abstract class MyClass2 {
        public abstract void display2();
    }

    class AbstClassP4ex extends MyClass2{
        public void display2(){
            System.out.println("This is not the Private Class ");
        }
    }
    abstract class MyClass3 {
        public void display3(){
            System.out.println("this is an abstract class without abstract method");
        }
    }


    class AbstClassP6ex extends MyClass3{
    }


    public class a4 {
        public static void main(String[] args) {
            person user1 = new person("priyanshi");
            System.out.println(user1.getname());
           
            new AbstClassP3ex().display();
            new AbstClassP4ex().display2();
            new AbstClassP6ex().display3();

        }
    }