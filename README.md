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

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a person is an object. The person has attributes, such as weight and height, and methods, such as run and drive. A Class is like an object constructor, or a "blueprint" for creating objects.Consider a class person each person has a name, date of birth, quailification, age, etc.
* Syntax (Creating a class)
```
access_modifier class class_name {
    objects, variables, methods, constuctor
}
```
OBJECT

Now consider me as a Creator of my world and I wanted a new person so I created an object using a new keyword.
* Syntax (Creating a object)
```
class_name object_name = new class_name();
```
CONSTRUCTOR

Java always provides us with default constructor with no parameter if we create a new constructor with params it gets override so we need to create both default and parameterized constructor. Constructor has the same name as class name. Constructor does not return any value. 
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

Methods also have same properties as constuctor but the constuctor can have any name other than class name and method can return values. Method can be called using `object_name.method_name` depending on access modifiers it can be used any where.
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

The `static` keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.Static can be used with variable, methods, block and nested class
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
___
3. Access modifiers
___
The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
There are four types of Java access modifiers:
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
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
In this part, we will learn about Java exceptions, it's types, and the difference between checked and unchecked exceptions.

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
## PART-4 (OOP's concept)

1. Inheritance
2. Abstraction
3. Encapsulation
4. Polymorphism
## PART-5 (Collections)
