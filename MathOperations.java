
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] argus ){
        //Arithmetic operator
        int a = 10, b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
// Unary operator
        int x = 5;
        System.out.println(x++); 
        System.out.println(++x);

// Assignment operator
        int num = 20;
        num += 5;
        System.out.println(num);

// Relational operator
        System.out.println(a > b);
        System.out.println(a == b);

// Logical operator
        boolean p = true, q = false;
        System.out.println(p && q);
        System.out.println(p || q);

// Ternary operator
        int marks = 60;
        String result = (marks >= 50) ? "Pass" : "Fail";
        System.out.println(result);
    }
}