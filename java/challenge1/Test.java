import java.util.*;
import java.util.stream.*;
public class Test
{
    public static void main(String[] args) {
    int [] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    System.out.println("Reverse Array:");
         for(int i=Array.length-1;i>=0;i--)
         System.out.print(Array[i] + " ");
    }
}