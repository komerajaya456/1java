import java.util.Scanner;

public class swt_case {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("enter character :- ");

        char character =inp.next().charAt(0);

        System.out.println(character);

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
        //this is the comment to check whether working properly or not
            default:
            System.out.println("Entered other than A B C D");
                break;
        }
        
    }
}
