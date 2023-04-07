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

The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.
___
3. Access modifiers
___

___
4. try catch - [final, finally finalize, throws, throws]
___

___
5. inner class
___
## PART-4 (OOP's concept)
## PART-5 (Collections)
