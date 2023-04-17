# BASIC-JAVA
Simple java with basics

## 1. PART-1 (Data Types)
Data types are divided into 2 main types primitive (basic data types) and non-primitive (derived data types) data type
> - Primitive Data Type
>   - Boolean Data Type
>     - [boolean](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Boolean_Type.java)
>   - Numeric Data Type
>     - Character Data Type
>       - [char](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Char_Type.java)
>     - Integral Data Type
>       - Integer Data Type
>         - [byte](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Byte_Type.java)
>         - [short](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Short_Type.java)
>         - [int](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Int_Type.java)
>         - [long](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Long_Type.java)
>       - Floating Data Type
>         - [float](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Float_Type.java)
>         - [double](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Primitive/src/main/java/com/sample/Double_Type.java)
> - Non Primitive Data Type
>   - [Arrays](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Non-Primitive/src/main/java/com/sample/Array_Type.java)
>   - [String](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-1-Data-Types/Non-Primitive/src/main/java/com/sample/String_Type.java)
>   - Classes
>   - Interface
## PART-2 (Loops and Cases)
Loop - when you want to write 1000 same lines in java use loops.

Cases - if you want to check conditions and process it then use the cases
> - cases
>   - [if statement](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Cases/src/main/java/com/sample/IF_Case_Simple.java)
>   - [if - else](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Cases/src/main/java/com/sample/IF_Else_Case.java)
>   - [if - else if - else](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Cases/src/main/java/com/sample/IF_Else_IF_Case.java)
>   - [if ( if else ) else ( if - else )](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Cases/src/main/java/com/sample/IF_Else_Nested_Case.java)
>   - [switch](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Cases/src/main/java/com/sample/Switch_Case.java)
> - loop
>   - [simple for loop](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Loops/src/main/java/com/sample/For_Loop.java)
>   - [enhance for loop](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Loops/src/main/java/com/sample/For_Loop_Enhanced.java)
>   - [while loop](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Loops/src/main/java/com/sample/While_Loop.java)
>   - [do while loop](https://github.com/Vishal-S-J/BASIC-JAVA/blob/main/Part-2-Loops-Cases/Loops/src/main/java/com/sample/Do_While_Loop.java)
## PART-3 (KEYWORDS)
There are many main keyword which are used in simple java codes on daily basis.
> [abstract, boolean, break, byte, case, catch, char, class, continue, default, do, double, else, enum, extends, final, finally, float, for, if, implements, import, instanceof, int, interface, long, new, package, private, protected, public, return, short, static, super, switch, this, throw, throws, try, void, while]
___
1. [interface, class, object, constructor, method]  [code](code)
___
INTERFACE

- An interface in Java is a blueprint of a class. It has static constants and abstract methods.
- The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
- In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
- Java Interface also represents the IS-A relationship
- Why use Java interface?
    - It is used to achieve abstraction.
    - By interface, we can support the functionality of multiple inheritance.
    - It can be used to achieve loose coupling.
- ex. Person is an interface and Student, Professor, Workers these are all classes. then student "is a" person same on worker "is a" person.
* Syntax (Creating an interface)
```
interface <interface_name>{
    // declare constant fields
    // declare methods that abstract
    // by default.
}
```

CLASS

- Everything in Java is associated with classes and objects, along with its attributes and methods. 
- For example: in real life, a person is an object.
- The person has attributes, such as weight and height, and methods, such as run and drive. 
- A Class is like an object constructor, or a "blueprint" for creating objects.
- Consider a class person each person has a name, date of birth, quailification, age, etc.
* Syntax (Creating a class)
```
access_modifier class class_name {
    objects, variables, methods, constuctor
}
```
OBJECT

- Now consider me as a Creator of my world and I wanted a new person so I created an object using a new keyword.
- new class_name() this is called as new object and
- class_name object_name this is called as reference variable.
* Syntax (Creating a object)
```
class_name object_name = new class_name();
```
CONSTRUCTOR

- Java always provides us with default constructor with no parameter if we create a new constructor with params it gets override so we need to create both default and parameterized constructor. 
- Constructor has the same name as class name. 
- Constructor does not return any value. 
* Syntax (Creating a constructor)
```
class_name() {
  code
}

OR

class_name(parameters) {
  code
}
```
METHOD

- Methods also have same properties as constuctor but the constuctor can have any name other than class name and method can return values. 
- Method can be called using `object_name.method_name` depending on access modifiers it can be used any where.
* Syntax (Creating a method)
```
access_modifier return_type method_name(params) {
  code to execute
}
```
___
2. [static, abstract, this, final, super]
___
STATIC

- The `static` keyword in Java is used for memory management mainly. 
- We can apply static keyword with variables, methods, blocks and nested classes. 
- The static keyword belongs to the class than an instance of the class.
- Static can be used with variable, methods, block and nested class.
* Syntax (static keyword)
```
static int counts = 0;    // for variable

static void met1() {      // for methods
    //code to execute
}

static {                  // for static block
    // code within static
}
```

ABSTRACT 

- The abstract keyword is a non-access modifier, used for classes and methods.
- Class: An abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
- Method: An abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
- Note - We cannot declare abstract methods in non abstract class.
* Syntax (abstract keyword)
```
abstract class class_name {  
    abstract return_type method_name();
}   
```

THIS

- There can be a lot of usage of Java this keyword.
- In Java, this is a reference variable that refers to the current object.
    - this: to refer current class instance variable
    - this: to invoke current class method
    - this() : to invoke current class constructor.
    - this: to pass as an argument in the method
    - this: to pass as argument in the constructor call.
    - this keyword can be used to return current class instance

FINAL

- The final keyword in java is used to restrict the user. 
- The java final keyword can be used in many context. 
- Final can be:
    - variable
    - method
    - class
- The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. 
- It can be initialized in the constructor only. 
- The blank final variable can be static also which will be initialized in the static block only. 
- We will have detailed learning of these in codes.
* Syntax
```
final int PI = 3.142  //for variable

final void method_name() {  // for method (cannot override)
    //code
}

final class class_name {    // for class (cannot extend)
    //code
}
```

SUPER

- The super keyword in Java is a reference variable which is used to refer immediate parent class object.
- Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
- Usage of Java super Keyword
     - super can be used to refer immediate parent class instance variable.
     - super can be used to invoke immediate parent class method.
     - super() can be used to invoke immediate parent class constructor.
- Note: super() is added in each class constructor automatically by compiler if there is no super() or this().

___
3. Access modifiers
___
- The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. 
- We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
- There are four types of Java access modifiers:
> [public, private, protected, default]

> |Access Modifier|Within Class|Within Package|Outside package by subclass only|outside package|
> |:-------------:|:----------:|:------------:|:------------------------------:|:-------------:|
> |Private|Y|N|N|N|
> |Default|Y|Y|N|N|
> |Protected|Y|Y|Y|N|
> |Public|Y|Y|Y|Y|
___
4. Exception Handling - [final, finally finalize, throws, throws]
___
- The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
- In this part, we will learn about Java exceptions, it's types, and the difference between checked and unchecked exceptions.

General : In Java, an exception is an event that disrupts the normal flow of the program.
It is an object which is thrown at runtime.

Hierarchy of Java Exception classes
```bash
└──Throwable
    ├──Error
    │   ├──StackOverFlowError
    │   ├──VirtualMachineError
    │   └──OutOfMemoryError
    └──Exception
         ├──IOException
         ├──SQLException
         ├──ClassNotFoundException
         └──RuntimeException
              ├──ArithmaticException
              ├──NullPointerException
              ├──NumberFormatException
              └──IndexOutOfBoundException
                   ├──ArrayIndexOutOfBoundsException
                   └──StringIndexOutOfBoundsException
```
Types
There are mainly two types of exceptions: checked and unchecked.
An error is considered as the unchecked exception. However, according to Oracle, there are three types of exceptions namely:
1. Checked Exception -
The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
For example, IOException, SQLException, etc.
Checked exceptions are checked at compile-time.
2. Unchecked Exception -
The classes that inherit the RuntimeException are known as unchecked exceptions.
For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
3. Error -
Error is irrecoverable.
Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

DIFFERENCE BETWEEN THROW AND THROWS
> Point | throw | throws |
> |:-----:|:-----:|:------:
> |Definition|Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.|Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.|
> |When to use|Type of exception Using throw keyword, we can only propagate unchecked exception i.e., the checked exception cannot be propagated using throw only.|Using throws keyword, we can declare both checked and unchecked exceptions. However, the throws keyword can be used to propagate checked exceptions only.|
> |Syntax|The throw keyword is followed by an instance of Exception to be thrown.|The throws keyword is followed by class names of Exceptions to be thrown.|
> |Declaration|throw is used within the method.|throws is used with the method signature.|
> |Internal Implementation|We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.|We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.|

DIFFERENCE BETWEEN FINAL, FINALLY, FINALIZE
> | Key | final | finally | finalize |
> |:---:|:-----:|:-------:|:--------:|
> |Definition| final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.|finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.|finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.|
> |Applicable to| Final keyword is used with the classes, methods and variables.|Finally block is always related to the try and catch block in exception handling.|finalize() method is used with the objects.|
> |Functionality|(1) Once declared, final variable becomes constant and cannot be modified.(2) final method cannot be overridden by sub class.(3) final class cannot be inherited.|(1) finally block runs the important code even if exception occurs or not.(2) finally block cleans up all the resources used in try block|finalize method performs the cleaning activities with respect to the object before its destruction.|
> |Execution|Final method is executed only when we call it.|Finally block is executed as soon as the try-catch block is executed. It's execution is not dependant on the exception.|finalize method is executed just before the object is destroyed.|
___
5. Remaining keywords
___

> [enum, extends, finalize, implements, import, instanceof, new, package, return, void.]

ENUM
- The Enum in Java is a data type which contains a fixed set of constants.
- It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY).
- It's written in the class
* Syntax
```
public enum enum_name {
    value1, value2, ..., valuen
}
```

EXTENDS

- The extends keyword extends a class (indicates that a class is inherited from another class).
- In Java, it is possible to inherit attributes and methods from one class to another. 
- We group the "inheritance concept" into two categories:
    - subclass (child) - the class that inherits from another class.
    - superclass (parent) - the class being inherited from.
- To inherit from a class, use the extends keyword.
* Syntax
```
class parent_class {
    variables and methods
}

public class child_class extends parent_class {
    inherites the parent class variables and methods.
}
```

FINALIZE

- finalize() is a method of the Object class in Java.
- The finalize() method is a non-static and protected method of java.lang.Object class.
- finalize() method in Java is used to release all the resources used by the object before it is deleted/destroyed by the Garbage collector.
- finalize is not a reserved keyword, it's a method. 
- Once the clean-up activity is done by the finalize() method, garbage collector immediately destroys the Java object. 
- Java considers unreferenced objects that are not being used by any program execution or objects that are no longer needed, as garbage.
    - By anonymous object `new class_name()`
    - By nulling reference  `Student s = new Student(); s = null;`
    - By assigning a reference to another object  `Student s1 = new Student();  Student s2 = new Student();  s1 = s2;` this will consider s1 as garbage.
- Garbage collector in java can be called explicitly using `System.gc()` this method.

IMPLEMENTS

- The implements keyword is used to implement an interface.
- The interface keyword is used to declare a special type of class that only contains abstract methods.
- To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
- The body of the interface method is provided by the "implement" class.

```
interface parent_class {
    variables and methods
}

public class child_class extends parent_class {
    inherites the parent class variables and methods.
}
```

IMPORT

- The import keyword is used to import a package, class or interface.

INSTANCEOF

- The instanceof keyword checks whether an object is an instance of a specific class or an interface.
- The instanceof keyword compares the instance with type. 
- The return value is either true or false.
```
public class Main {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj instanceof Main); // returns true
  }
}
```
NEW

- The new keyword creates new objects.
- Main myObj = new Main();

PACKAGE

- The package keyword creates a package.

RETURN

- The return keyword finished the execution of a method, and can be used to return a value from a method.

VOID

- The void keyword specifies that a method should not have a return value.

## PART-4 (OOP's concept)

___
# 1. ENCAPSULATION
___
- The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
- To achieve this, you must:
- declare class variables/attributes as private and provide public get and set methods to access and update the value of a private variable
a. Get and Set
- You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it).
- However, it is possible to access them if we provide public get and set methods.
- The get method returns the variable value, and the set method sets the value.
- Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case
- Further details and Example are in code.
b. Why Encapsulation?
- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

2. Inheritance
3. Polymorphism
4. Abstraction

## PART-5 (Collections)
