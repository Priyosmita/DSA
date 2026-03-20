// Practicing from Kunal Kushwal=ha's videos

 import java.util.*;
 
 public class Main{
    public static void main(String[] args) {
         
        Scanner sc= new Scanner (System.in);
         
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        
        System.out.println("Enter the array:"); 
        for(int i=0;i<5;i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println("Max element is:" +max(list));
    }
    
    public static int max(ArrayList <Integer> list) {
        if (list.size()==0) return -999;
        int m= list.get(0);
        for(int i=0; i<list.size();i++) {
            m= m<list.get(i)? m= list.get(i):m;
        }
        
        return (m);
    }
 }

// note to self: Can also be done if a certain range is given, then simply pass the range to the max funtion and iterate only within the range
// also account for edge cases like if array is empty
