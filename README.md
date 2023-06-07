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

NOTES :: (difference between static and final) :: The static keyword is used to represent the class member. It is basically used with methods and variables to indicate that it is a part of the class, not the object. On the other hand, the final keyword is used to proclaim a constant variable and to bind the user from accessing a method, variable, or class.
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
__1. ENCAPSULATION__
___
1. Encapsulation in Java
- The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
- To achieve this, you must:
- declare class variables/attributes as private and provide public get and set methods to access and update the value of a private variable

2. Get and Set
- You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it).
- However, it is possible to access them if we provide public get and set methods.
- The get method returns the variable value, and the set method sets the value.
- Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case
- Further details and Example are in code.

3. Why Encapsulation?
- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

___
__2. INHERITANCE__
___
1. Inheritance in Java
- Java, Inheritance is an important pillar of OOP(Object-Oriented Programming). 
- It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class.
- In Java, Inheritance means creating new classes based on existing ones. 
- A class that inherits from another class can reuse the methods and fields of that class.
- In addition, you can add new fields and methods to your current class as well.  

2. Why Do We Need Java Inheritance
    1. Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.
    2. Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves Run Time Polymorphism.
    3. Abstraction: The concept of abstract where we do not have to provide all details is achieved through inheritance. Abstraction only shows the functionality to the user.
    
3. Important Terminologies Used in Java Inheritance 
    1. Class: Class is a set of objects which shares common characteristics/ behavior and common properties/ attributes. Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
    2. Super Class/Parent Class: The class whose features are inherited is known as a superclass(or a base class or a parent class).
    3. Sub Class/Child Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
    4. Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
    
4. How to Use Inheritance in Java?
- The extends keyword is used for inheritance in Java. Using the extends keyword indicates you are derived from an existing class. In other words, “extends” refers to increased functionality.
* Syntax
```
class derived-class extends base-class  
{  
   //methods and fields  
}  
```
5. Inheritance in Java Example

___
__3. Polymorphism__
___
1. Polymorphism in Java
- The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.
- A person at the same time can have different characteristics. 
- Like a man at the same time is a father, a husband, an employee.
- So the same person possesses different behavior in different situations. 
- In Java polymorphism is mainly divided into two types: 
    - Compile-time Polymorphism
    - Runtime Polymorphism

2. Type 1: Compile-time polymorphism
- It is also known as static polymorphism. 
- This type of polymorphism is achieved by function overloading (method overloading) or operator overloading (not supported).
- Method Overloading: 
   - When there are multiple functions with the same name but different parameters then these functions are said to be overloaded.
   - Functions can be overloaded by changes in the number of arguments or/and a change in the type of arguments.

3. Type 2: Runtime polymorphism
- It is also known as Dynamic Method Dispatch.
- It is a process in which a function call to the overridden method is resolved at Runtime.
- This type of polymorphism is achieved by Method Overriding.
- Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. 
- That base function is said to be overridden.

___
__4. Abstraction__
___
1. Abstraction in java
- Data abstraction is the process of hiding certain details and showing only essential information to the user.
- Abstraction can be achieved with either abstract classes or interfaces
- The abstract keyword is a non-access modifier, used for classes and methods:
   - Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
   - Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
- An abstract class can have both abstract and regular methods

2. Details
- It is not possible to create an object of the Abstract class.
- To access the abstract class, it must be inherited from another class.

3. Why And When To Use Abstract Classes and Methods?
- To achieve security - hide certain details and only show the important details of an object.
- Note: Abstraction can also be achieved with Interfaces.

## PART-5 (Collections)
1. What is collections
- The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
- Java Collections can achieve all the operations that we perform on a data such as searching, sorting, insertion, manipulation, and deletion.
- Java Collection means a single unit of objects. 
- Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

2. What is Collection framework
- The Collection framework represents a unified architecture for storing and manipulating a group of objects. 
- It has:
    - Interfaces and its implementations, i.e., classes
    - Algorithm

3. Hierarchy of Collection Framewor
>```
>                  ITERABLE(I)
>                       |
>                       | 
>                 COLLECTION(I)
>                       |
>     __________________|_____________________
>     |                 |                    |
> LIST(I)           QUEUE(I)               SET(I)
> |                   |    |                |   |
> |                   |    |                |   |
> |--ARRAYLIST(C)     |   PRIORITYQUEUE(C)  |   |-HASHSET(C)
> |                 DEQUEUE(I)              |   |
> |--LINKEDLIST(C)----|                     |   |-LINKEDHASHSET(C)
> |                   |                   SORTEDSET(I)
> |--VECTOR(C)     ARRAYDEQUEUE(C)          |
>     |                                     |
>    STACK(C)                             TREESET(C)
>    ```

4. ITERABLE Interface
- The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.
- It contains only one abstract method. i.e.,`Iterator<T> iterator() `
- It returns the iterator over the elements of type T.

| Method | Description |
|:---:|:---|
|public boolean hasNext()|It returns true if the iterator has more elements otherwise it returns false.|
|public Object next()|It returns the element and moves the cursor pointer to the next element.|
|public void remove()|It removes the last elements returned by the iterator. It is less used.|

5. COLLECTION Interface
- The Collection interface is the interface which is implemented by all the classes in the collection framework.
- It declares the methods that every collection will have.
- In other words, we can say that the Collection interface builds the foundation on which the collection framework depends.

| Method | Description |
|:---:|:---|
|public boolean add(E e)|It is used to insert an element in this collection.|
|public boolean addAll(Collection<? extends E> c)|It is used to insert the specified collection elements in the invoking collection.|
|public boolean remove(Object element)|	It is used to delete an element from the collection.|
|public boolean removeAll(Collection<?> c)|It is used to delete all the elements of the specified collection from the invoking collection.|
|default boolean removeIf(Predicate<? super E> filter)|It is used to delete all the elements of the collection that satisfy the specified predicate.|
|public boolean retainAll(Collection<?> c)|It is used to delete all the elements of invoking collection except the specified collection.|
|public int size()|It returns the total number of elements in the collection.|
|public void clear()|It removes the total number of elements from the collection.|
|public boolean contains(Object element)|It is used to search an element.|
|public boolean containsAll(Collection<?> c)|It is used to search the specified collection in the collection.|
|public Iterator iterator()|It returns an iterator.|
|public Object[] toArray()|It converts collection into array.|
|public <T> T[] toArray(T[] a)|It converts collection into array. Here, the runtime type of the returned array is that of the specified array.|
|public boolean isEmpty()|It checks if collection is empty.|
|default Stream<E> parallelStream()|It returns a possibly parallel Stream with the collection as its source.|
|default Stream<E> stream()|It returns a sequential Stream with the collection as its source.|
|default Spliterator<E> spliterator()|It generates a Spliterator over the specified elements in the collection.|
|public boolean equals(Object element)|It matches two collections.|
|public int hashCode()|It returns the hash code number of the collection.|

6. LIST Interface
- List interface is the child interface of Collection interface.
- It inhibits a list type data structure in which we can store the ordered collection of objects.
- It can have duplicate values.
- List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
- To instantiate the List interface, we must use:
```
List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack();  
```
- There are various methods in List interface that can be used to insert, delete, and access the elements from the list.

A. ARRAYLIST
- The ArrayList class implements the List interface.
- It uses a dynamic array to store the duplicate element of different data types.
- The ArrayList class maintains the insertion order and is non-synchronized.
- The elements stored in the ArrayList class can be randomly accessed.

B. LINKEDLIST
- LinkedList implements the Collection interface.
- It uses a doubly linked list internally to store the elements.
- It can store the duplicate elements.
- It maintains the insertion order and is not synchronized.
- In LinkedList, the manipulation is fast because no shifting is required.

C. VECTOR
- Vector uses a dynamic array to store the data elements.
- It is similar to ArrayList.
- However, It is synchronized and contains many methods that are not the part of Collection framework.

D. STACK
- The stack is the subclass of Vector.
- It implements the last-in-first-out data structure, i.e., Stack.
- The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

7. QUEUE Interface
- Queue interface maintains the first-in-first-out order.
- It can be defined as an ordered list that is used to hold the elements which are about to be processed.
- There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
- Queue interface can be instantiated as:
```
Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque(); 
```

A. PRIORITYQUEUE
- The PriorityQueue class implements the Queue interface.
- It holds the elements or objects which are to be processed by their priorities.
- PriorityQueue doesn't allow null values to be stored in the queue.

B. DEQUE Interface
- Deque interface extends the Queue interface.
- In Deque, we can remove and add the elements from both the side.
- Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
- Deque can be instantiated as:
```
Deque d = new ArrayDeque();
```

a. ARRAYDEQUE
- ArrayDeque class implements the Deque interface.
- It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
- ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

8. SET Interface
- Set Interface in Java is present in java.util package.
- It extends the Collection interface.
- It represents the unordered set of elements which doesn't allow us to store the duplicate items.
- We can store at most one null value in Set.
- Set is implemented by HashSet, LinkedHashSet, and TreeSet.
- Set can be instantiated as:
```
Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>();  
```

A. HASHSET
- HashSet class implements Set Interface.
- It represents the collection that uses a hash table for storage. 
- Hashing is used to store the elements in the HashSet.
- It contains unique items.

B. LINKEDHASHSET
- LinkedHashSet
- LinkedHashSet class represents the LinkedList implementation of Set Interface.
- It extends the HashSet class and implements Set interface.
- Like HashSet, It also contains unique elements.
- It maintains the insertion order and permits null elements.

C. SORTEDSET Interface
- SortedSet is the alternate of Set interface that provides a total ordering on its elements.
- The elements of the SortedSet are arranged in the increasing (ascending) order.
- The SortedSet provides the additional methods that inhibit the natural ordering of the elements. 
- The SortedSet can be instantiated as:
```
SortedSet<data-type> set = new TreeSet();
```

a. TREESET
- Java TreeSet class implements the Set interface that uses a tree for storage.
- Like HashSet, TreeSet also contains unique elements.
- However, the access and retrieval time of TreeSet is quite fast.
- The elements in TreeSet stored in ascending order.

___
Java Map Interface
___

1. MAP Interface
- A map contains values on the basis of key, i.e. key and value pair.
- Each key and value pair is known as an entry.
- A Map contains unique keys.
- A Map is useful if you have to search, update or delete elements on the basis of a key.
- A Map doesn't allow duplicate keys, but you can have duplicate values.
- HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

2. Java Map Hierarchy
```
            Map(I)
              |
   -----------|---------
SortedMap(I)        HashMap(C)
    |                   |
    |                   |
TreeMap(C)          LinkedHashMap(C)

```

3. HashMap
- Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
- If you try to insert the duplicate key, it will replace the element of the corresponding key.
- It is easy to perform operations using the key index like updation, deletion, etc.
- HashMap class is found in the java.util package.
- HashMap in Java is like the legacy Hashtable class, but it is not synchronized.
- It allows us to store the null elements as well, but there should be only one null key.

4. LinkedHashMap
- Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order.
- It inherits HashMap class and implements the Map interface.

5. TreeMap class
- Java TreeMap class is a red-black tree based implementation.
- It provides an efficient means of storing key-value pairs in sorted order.
