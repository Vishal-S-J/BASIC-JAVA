import java.util.*;

class ArrayListClass {
    public void methArrayList(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through Iterator
        Iterator itr=list.iterator();
        System.out.print("ARRAYLIST [");
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println("]");
    }
}

class LinkedListClass {
    public void methLinkedList(){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();
        System.out.print("LINKEDLIST [");
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println("]");
    }
}

class VectorClass {
    public void methVector(){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");

        System.out.print("VECTOR [");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println("]");
    }
}

class StackClass {
    public void methStack(){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();

        Iterator<String> itr=stack.iterator();
        System.out.print("STACK [");
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println("]");
    }
}

public class ListInterface {
    public static void main(String[] args) {
        System.out.println("=========================================");
        ArrayListClass arrayListClass = new ArrayListClass();
        arrayListClass.methArrayList();
        System.out.println("=========================================");
        LinkedListClass linkedListClass = new LinkedListClass();
        linkedListClass.methLinkedList();
        System.out.println("=========================================");
        VectorClass vectorClass = new VectorClass();
        vectorClass.methVector();
        System.out.println("=========================================");
        StackClass stackClass = new StackClass();
        stackClass.methStack();
        System.out.println("=========================================");
    }
}
