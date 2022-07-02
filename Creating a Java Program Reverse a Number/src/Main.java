import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner (System.in);
        System.out.print("PLEASE add any number to revers it: ");
		while(!UserInput.hasNextInt()) {
            UserInput.next();

            System.out.println("PLEASE add any number to revers it: ");
            System.err.println("You Entered INVALID input");

		}

            int Num = UserInput.nextInt(); //convert UserInput object to int
            int reverseNum =0; // to save the result

             for(int i = Num ; i>0; i=i/10) {
            	 reverseNum=reverseNum*10;
            	 reverseNum=reverseNum+i%10;
             }
             
             System.out.println("The reverseNum is ="+reverseNum);
             System.out.println("THANK YOU");

        UserInput.close();
	}

}
