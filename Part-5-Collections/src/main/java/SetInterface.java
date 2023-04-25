import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class HashSetClass {
    public void methHashSet(){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

class LinkedHashSetClass{
    public void methLinkedHashSet(){
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}



class TreeSetClass{
    public void methTreeSet(){
        //Creating and adding elements
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        //traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

public class SetInterface {
    public static void main(String[] args) {
        System.out.println("====================================================");
        HashSetClass hashSetClass = new HashSetClass();
        hashSetClass.methHashSet();
        System.out.println("====================================================");
        LinkedHashSetClass linkedHashSetClass = new LinkedHashSetClass();
        linkedHashSetClass.methLinkedHashSet();
        System.out.println("====================================================");
        TreeSetClass treeSetClass = new TreeSetClass();
        treeSetClass.methTreeSet();
        System.out.println("====================================================");

//        Set<data-type> s1 = new HashSet<data-type>();
//        Set<data-type> s2 = new LinkedHashSet<data-type>();
//        Set<data-type> s3 = new TreeSet<data-type>();
    }
}
