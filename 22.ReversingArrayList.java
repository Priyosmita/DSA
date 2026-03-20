// Practicing from Kunal Kushwaha's videos
// Reversing an arraylist without third variable

 import java.util.*;
 
 public class Main{
    public static void main(String[] args) {
         
        Scanner sc= new Scanner (System.in);
         
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        
        System.out.println("Enter the array:"); 
        for(int i=0;i<5;i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println("Original array: " +list);
        
        reverse(list);
        System.out.println("Reversed array: " +list);
    }
    
    public static void reverse(ArrayList <Integer> list) {
        int i= 0;
        int j= list.size()-1;
        
            while(i<j) {
                list.set(i, list.get(i)^list.get(j));
                list.set(j, list.get(i)^list.get(j));
                list.set(i, list.get(i)^list.get(j));
                i++;
                j--;
            }
    }
 }
