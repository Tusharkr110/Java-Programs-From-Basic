// Resolution Priority Of Multiple Inheritance is the situation if a class extends a class and simultaneously implements another interface and both interface and class have same method and we are trying to class the same method from this class, then it becomes the same situation as of multiple inheritance where two methods are of same name and compiler got confused which one to call.

// so to tackle this the priority is given to method of the extended class if this situation occurs.

// we resolve the issue of multiple inheritance using interfaces where the implemented class has the option to decide which one to call and solve the confusion issue for compiler due to interfaces restrictions on different access and its defination.

public class javaResolutionPriorityOfMultipleInheritance {
    public static void main(String[] args) {
        
        C c = new C();

        
    }
}

interface A{
    default void fun(){
        System.out.println("Inside interface A");
    }
}

class B{
    public void fun(){
        System.out.println("Inside class B.");
    }
}

class C extends B implements A{
}

