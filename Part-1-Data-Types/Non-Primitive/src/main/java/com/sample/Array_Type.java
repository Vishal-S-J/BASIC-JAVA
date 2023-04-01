package com.sample;

/**
 * Normally, an array is a collection of similar type of elements which has contiguous memory location.
 *
 * Java array is an object which contains elements of a similar data type.
 * Additionally, The elements of an array are stored in a contiguous memory location.
 * It is a data structure where we store similar elements.
 * We can store only a fixed set of elements in a Java array.
 *
 * Array in Java is index-based,
 * the first element of the array is stored at the 0th index,
 * 2nd element is stored on 1st index and so on.
 *
 * There are two types of array.
 *      Single Dimensional Array
 *          dataType[] arr; (or)
 *          dataType []arr; (or)
 *          dataType arr[];
 *      Multidimensional Array
 *          dataType[][] arrayRefVar; (or)
 *          dataType [][]arrayRefVar; (or)
 *          dataType arrayRefVar[][]; (or)
 *          dataType []arrayRefVar[];
 * */

public class Array_Type {
    public static void main(String[] args) {
        int a[]={33,3,4,5};//declaration, instantiation and initialization
        //printing array
        for(int i=0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);


        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        //printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
