import java.util.Scanner;

public class swt_case {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("enter character :- ");

        char character =inp.next().charAt(0);

        System.out.println(character);
  //to chk whheter
        switch (character) {
            case 'A':
                System.out.println("entered A");                
                break;
            case 'B':
                System.out.println("entered b");                
                break;
            case 'C':
                System.out.println("entered c");                
                break;
            
                case 'E':
                System.out.println("entered E");                
                break;


            case 'D':
                System.out.println("entered d");                
                break;
      
            default:
            System.out.println("Entered other than A B C E");
                break;
        }
        
    }
}
