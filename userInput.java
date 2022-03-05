import java.util.LinkedList;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want :");
        int num=sc.nextInt();

        for(int i=0;i<num;i++){
            System.out.print("Add a element : ");
            String element=sc.next();
            list.add(element);
        }

        System.out.print("Linked List elements are :");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));            
        }
    }
}
