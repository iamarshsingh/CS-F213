**Object Oriented Programming Lab3** 

The objective of this lab is to test the understanding of method overloading, constructor overloading and static variables in Java.<br>

The problem statement is defined in the javadoc provided. Please go through the notes below for additional information.<br>

Steps to get started:
1. Download the docs.zip and extract it.
1. Open index.html page. This page contains all the information about the class and methods to be created. 
1. For this lab, you have to create two classes named `Quadrilateral` and `Triangle` . Define the properties and methods as described in the javadoc.
1. Go through the javadoc carefully, and take care of the method signatures. 
1. No main method has to be created in any class. 
1. Make sure the parameter types, return types, and print statements match exactly as given in the javadoc.
1. Create a repository named `Lab3` on your Gitlab account and upload your solution according to the directory structure and filenames provided in the AutolabJS instructions and javadoc.
1. Submit on AutolabJS for `Lab3`.

Note: 

1. The Prelab statement uses the statement
    ```java
    result = 37 * result + id.hashCode();
    ```     
    
    Here, `id` is of type `int` and it's hashcode would give an error.<br>
    The correct statement here would be:
    
    ```java
    result = 37 * result + id;
    ```     

    The same would be followed for all the primitive types(char, int, boolean, double, float).
1. The static variable `countTriangle` of the class `Triangle` has to be initialised to 0 globally within the class outside the constructor.
1. There are 8 test cases with 2 test cases(Test case 4 and 8) of 2 marks each and the rest for 1 mark each.
1. Please refer to the pre lab sheet carefully for implementing `hashCode()` and `equals()` methods.
1. All calculations are of integer type. Do not use any other datatype for the same.
1. You can submit any number of times till the deadline ends. 
1. For final consideration, only your best score across all submissions will be taken.

Method decriptions from their javadoc:
1. equals()
    ```
    public boolean equals(Object obj)
    
    Indicates whether some other object is "equal to" this one.
    
    The equals method implements an equivalence relation on non-null object references:
    
        It is reflexive: for any non-null reference value x, x.equals(x) should return true.
        It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
        It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
        It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
        For any non-null reference value x, x.equals(null) should return false. 
    
    The equals method for class Object implements the most discriminating possible equivalence relation on objects; that is, for any non-null reference values x and y, this method returns true if and only if x and y refer to the same object (x == y has the value true).
    
    Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.
    
    Parameters:
        obj - the reference object with which to compare.
    Returns:
        true if this object is the same as the obj argument; false otherwise.
    ```     


2. hashCode()
    ```
    public int hashCode()
    
    Returns a hash code value for the object. This method is supported for the benefit of hash tables such as those provided by HashMap.
    
    The general contract of hashCode is:
    
        Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer, provided no information used in equals comparisons on the object is modified. This integer need not remain consistent from one execution of an application to another execution of the same application.
        If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.
        It is not required that if two objects are unequal according to the equals(java.lang.Object) method, then calling the hashCode method on each of the two objects must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables. 
    
    As much as is reasonably practical, the hashCode method defined by class Object does return distinct integers for distinct objects. (This is typically implemented by converting the internal address of the object into an integer, but this implementation technique is not required by the Java™ programming language.)
    
    Returns:
        a hash code value for this object.
    ```     
