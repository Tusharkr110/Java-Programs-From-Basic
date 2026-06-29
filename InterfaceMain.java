public class InterfaceMain{
    public static void main(String args[]){


        Car thar = new Thar();
        thar.drive();

        Random r = new Random();
        r.fun();

        MathConstants m = new Random();
        // Accessing Variable of MathConstants using object of Random Class
        System.out.println(m.VALUE);

        // Accessing Variable of MathConstants using Class name (Static Mehtod.)
        System.out.println(MathConstants.PI_VALUE);


        Vehicle run = new Thar();
        run.runsOn();
        Vehicle.staticMethod();
    }
}

    interface MathConstants{
        int VALUE = 23;
        double PI_VALUE = 3.14153;
    }

    class Random implements MathConstants{
        public void fun(){
            System.out.println("In Interface Class the constants declared are ByDefault public static final and the data-type depends on the User.");
        }
    }

    interface Vehicle {

        void drive();

        default void runsOn(){
            privateMethod();
            System.out.println("Car runs on Desiel or Petrol and Now on Electricity.");
        }

        static void staticMethod(){
            
            System.out.println("Calling using Static Method.");
        }

        private void privateMethod(){

            System.out.println("This is a private method in Interface, which can be called from within the interface.");
        }

        default void getMethod(){
            privateMethod();
        }
        
    }

    abstract class Car implements Vehicle{
        @Override
        abstract public void drive();
    }


    class Thar extends Car{
        @Override
        public void drive(){
            System.out.println("I am driving a Black Thar.");
        }
    }