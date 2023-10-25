import java.util.Scanner;  // Import the Scanner class


public class palindromeChk{


    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String reverse = "";
        for(int i = userInput.length() - 1; i >= 0; i--){
            reverse += userInput.charAt(i);
        }
        boolean isPal = userInput.equals(reverse);
    
            if(isPal){
                System.out.println("It Is A Palindrome ");
            }else{
                System.out.println("Its Not A Palindrome");
            }
              }
            }
          
    