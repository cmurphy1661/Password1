import java.util.Scanner;
public class PasswordValidator{
   public static void getValidPassword(String password){
      int passwordLength = password.length();
      if(checkLength(passwordLength) && checkUpperCase(password) && checkLowerCase(password) && checkNumbers(password)){
         System.out.println("Password accepted");
      }
      else{
         System.out.println("Invalid password, try again");
   }
   }
   public static boolean checkLength(int length){
      if (length >= 8){
         return true;
      }
      else{
         return false;
      }
   }
   public static boolean checkUpperCase(String passwordUpper){
      int numUpper = 0;
      for(int i=0; i< passwordUpper.length(); i++){
         if (Character.isUpperCase(passwordUpper.charAt(i))){
            numUpper++;
         }
      }
         if (numUpper >= 2){
            return true;
         }
         else{
            return false;
         }
   }
   public static boolean checkLowerCase(String passwordLower){
      int numLower = 0;
      for(int i=0; i< passwordLower.length(); i++){
         if (Character.isLowerCase(passwordLower.charAt(i))){
            numLower++;
         }
      }
         if (numLower>= 1){
            return true;
         }
         else{
            return false;
         }
   }
   public static boolean checkNumbers(String passwordNumber){
      int checkNum = 0;
      for(int i = 0; i< passwordNumber.length(); i++){
         if (Character.isDigit(passwordNumber.charAt(i))){
            checkNum++;
         }
      }
      if(checkNum >= 2){
         return true;
      }
      else{
         return false;
      }
   }
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      String password = scnr.next();
      getValidPassword(password);
      while (scnr.hasNext()){
         int i = 2;
         String passwordi = scnr.next();
         getValidPassword(passwordi);
         i++;
      }
      

}
}
      
