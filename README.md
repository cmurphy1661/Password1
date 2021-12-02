The user will input a password and the program must check that it has:

At least 8 characters

At least two uppercase letters

At least one lowercase letter

At least two numbers

If the value is invalid, print "Invalid password, try again" and accept another input. Otherwise, print "Password accepted" and end the program.

You will have these methods:

main(String[]): calls getValidPassword

getValidPassword(): checks that the password has all criteria and prints the confirmation statement if valid, otherwise prints the invalid statement and accepts a new password

checkLength(String): returns true if the password String fits the length criteria, otherwise returns false

checkUpperCase(String): returns true if the password String has enough uppercase letters, otherwise returns false

checkLowerCase(String): returns true if the password String has enough lowercase letters, otherwise returns false

checkNumbers(String): returns true if the password String has enough numbers, otherwise returns false

The above list is in the format:

methodName(listOfParameterTypes): functionality and return values if any
