/*
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 *
 *  1) oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}.
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}.
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}.
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}.
 *
 *  6) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}.
 *
 *  7) sumN            - uses a while loop to find and return the sum of the first 
 *                       n integers. 
 *                       
 *  8) perfectSquaresF - uses a for loop to print the first n perfect squares.
 *
 *  9) sumSquaresW     - uses a while loop find and return the sum of the first n 
 *                       perfect squares.
 *
 * 10) iLoveJava       - uses a while loop to print the sentence "I love java." n
 *                       times.
 *
 * 11) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 12) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 13) divBy5or7Sum    - uses a while loop to find and return the sum of all values in 
 *                       the set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 14) bizzBuzz        - uses a while loop to count from 1 to n by ones. However,
 *                       if a number is divisible by 3, the word "bizz" should be 
 *                       printed, and if the number is divisible by 5, "buzz" should
 *                       be printed. Sample output:
 *
 *                       1, 2, Bizz, 4, Buzz, Bizz, 7, 8, Bizz, Buzz, 11, Bizz, 13, 14, 
 *                       Bizz Buzz, 16, 17, Bizz, 19, Buzz, Bizz, 22, 23, Bizz, ...
 *                       
 * 15) sumDigits       - uses a loop to find and return the sum of the digits in an int.
 *
 * 16) countEvens      - uses a loop to count the number of even digits in an int.
 *
 * 17) hasDigit        - uses the appropriate type of loop to return true if a number n
 *                       contains the digit d and false otherwise.
 *
 * 18) moreEvens       - returns true if a number n has more even digits than odd digits
 *                       and false otherwise.
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class MixedLoopPractice
 {
    //1 uses a for loop to print the set {1, 2, 3, ... , 30}.
     public static void oneToThirtyF()
    {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    //2 uses a while loop to print the set {1, 2, 3, ... , 30}.
    public static void oneToThirtyW()
    {
        int i = 1;
        while (i <= 30) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
        
    //3 uses a for loop to print the set {20, 18, 16, ... , 0}.
    public static void twentyToZeroF() {
        for (int i= 20; i >= 0; i -=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    //4 uses a while loop to print the set {20, 18, 16, ... , 0}.
    public static void twentyToZeroW() {
        int i = 20;
        while (i >= 0) {
            System.out.print(i + " ");
            i -= 2;
        }
        System.out.println();
    }
    
    //no 5
    public static void whereIs5() {
        System.out.println("Number 5 is missing.");
    }
    
    //6 uses a while loop to print the set {m, m+1, m+2, ... , n}.
    public static void countMtoN(int m, int n) {
        int i = m;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
    
    //7 uses a while loop to find and return the sum of the first n integers. 
    public static int sumN(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }
    
    //8 uses a for loop to print the first n perfect squares.
    public static void perfectSquaresF(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (Math.sqrt(i) == Math.floor(Math.sqrt(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
    //9 uses a while loop find and return the sum of the first n perfect squares
    public static int sumSquaresW(int n) {
        int i = 0;
        int sum = 0;
        while (i <= n) {
           if (Math.sqrt(i) == Math.floor(Math.sqrt(i))) {
                sum += i;
            } 
           i++;
        }
        return sum;
    }
    
    //10 uses a while loop to print the sentence "I love java." n times.
    public static void iLoveJava(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println("I love Java!");
            i++;
        }
    }
    
    //11 uses a for loop to count from 1 to 100 by ones, but only values that are evenly divisible by 2 and 9 are 
    //   printed. (you'll need to use an if statement.)
    public static void divBy2and9() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }                
    
    //12 uses a while loop to count from 1 to 100 by ones, but only values that are evenly divisible by 3 and 8 
    //   are printed. (you'll need to use an if statement.)
    public static void divBy3and8() {
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0 && i % 8 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }    
    
    //13 uses a while loop to find and return the sum of all values in the set {1, 2, 3, ... , 10000} 
    //   that are divisible by 5 or 7.
    public static void divBy5or7Sum() {
        int i = 1;
        int sum = 0;
        while (i <= 10000) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }                   
 
    //14 uses a while loop to count from 1 to n by ones. However, if a number is divisible by 3, the word "bizz" 
    //should be printed, and if the number is divisible by 5, "buzz" should be printed. 
    public static void bizzBuzz(int n) {
        int i = 1;
        String name = "";
        while (i <= n) {
            if (i % 3 == 0) {
                name += "Bizz ";
            }
            if (i % 5 == 0) {
                name += "Buzz ";
            }
            if (i % 3 !=0 && i % 5 != 0)  {
                name += (i + " ");
            }
            i++;
        }
        System.out.println(name);
    }                   
                       
    //15 uses a loop to find and return the sum of the digits in an int.
    public static int sumDigits(int n) {
        String strN = n + "";
        int sum = 0;
        for (int i = 0; i < strN.length(); i++) {
            sum += Integer.parseInt(strN.substring(i, i+1));
        }
        return sum;
    }   
    
    //16 uses a loop to count the number of even digits in an int.
    public static int countEvens(int n) {
       String strN = n + "";
       int evens = 0;
       int digit;
       for (int i = 0; i < strN.length(); i++) {
           digit = Integer.parseInt(strN.substring(i, i+1));
           if (digit % 2 == 0) {
               evens ++;
           }
       }
       return evens;
    }    
    
    //17 uses the appropriate type of loop to return true if a number n contains the digit d and false otherwise.
    public static boolean hasDigit(int n, int d) {
        for (int i = 0; i < (n + "").length(); i++) {
            if (((n + "").substring(i,i+1)).equals(d+"")) {
                return true;
            }
         }
        return false;
    }            
 
    //18 returns true if a number n has more even digits than odd digits and false otherwise.
    public static boolean moreEvens(int n) {
        String strN = n + "";
        int evens = 0;
        int odds = 0;
        int digit;
        for (int i = 0; i < strN.length(); i++) {
            digit = Integer.parseInt(strN.substring(i, i+1));
            if (digit % 2 == 0) {
                evens ++;
            }
            else {
                odds++;
            }
        }
        if (evens > odds) {
            return true;
        }
        return false;
    }            
                       
    public static void main(String[] args)
    {
        oneToThirtyF();
        oneToThirtyW();
        twentyToZeroF();
        twentyToZeroW();
        whereIs5();
        countMtoN(1, 5);
        System.out.println(sumN(3));
        perfectSquaresF(9);
        System.out.println(sumSquaresW(9));
        iLoveJava(3);
        divBy2and9();
        divBy3and8();
        divBy5or7Sum();
        bizzBuzz(20);
        System.out.println(sumDigits(122));
        System.out.println(countEvens(2212));        
        System.out.println(hasDigit(432, 3));
        System.out.println(moreEvens(223));
    }
 }
 