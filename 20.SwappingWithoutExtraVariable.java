// Practicing from Kunal Kushwaha's videos
// Simple swapping of two elements in an array without using a third variable
// two approaches

 import java.util.*;
 
 public class Main{
    public static void main(String[] args) {
         
        Scanner sc= new Scanner (System.in);
         
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        
        System.out.println("Enter the array:"); 
        for(int i=0;i<5;i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println(list);
        
        System.out.println("Enter the elements to swap:");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        
        // Swapping first and last elements
        change (list, index1, index2);
        
        System.out.println(list);
    }
    
    public static void change(ArrayList <Integer> list, int index1, int index2) {

        // using XOR operation
        list.set(index1, list.get(index1)^list.get(index2));
        list.set(index2, list.get(index1)^list.get(index2));
        list.set(index1, list.get(index1)^list.get(index2));

        // using addition substraction
        list.set(index1, list.get(index1)+list.get(index2));
        list.set(index2, list.get(index1)-list.get(index2));
        list.set(index1, list.get(index1)-list.get(index2));
    }
 }
