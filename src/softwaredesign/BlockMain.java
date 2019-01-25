package softwaredesign;


import java.util.Scanner;
public class BlockMain {
    
    public static void main(String[] args) {
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String word = input.next();
        
        char[]stringToArray = new char[word.length()];
        int locate = 0;
        
        
        
        for(int i = word.length() - 1; i >= 0; i--){
            stringToArray[locate] = word.charAt(i);
            locate++;
        }
        
        for(char output : stringToArray){
            System.out.println(output);
        } 
    }
}
