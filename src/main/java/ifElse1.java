
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIT
 */
public class ifElse1 
{
    public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            float input = scanner.nextFloat();
            System.out.println("number : "+ scanner.nextFloat());
            if(input - (int)input == 0)
                {
                    System.out.println("Output" + (int)input);
                }
            else
                {
                    System.out.println("Output" + input);
                }
        }
}
