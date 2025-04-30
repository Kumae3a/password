package com.mycompany.passgenerate;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class PassGenerate {

    public static void main(String[] args) {
        
        List<Character> arr = new ArrayList<>();
        
        PssSet lettersNumbers = new LettersNumbers(arr);
        PssSet number = new Numbers(arr);
        PssSet letters = new Letters(arr);
        PssSet lettNumbSymb = new LettNumbSymb(arr);
        

       

        Scanner in = new Scanner(System.in);
        System.out.print("Letters - 1\nNumbers - 2\nLetters and numbers - 3\nLetters, numbers and symbols - 4\n");
        int position = in.nextInt();
        System.out.print("Password length: ");
        int line = in.nextInt();
        if(position == 1){
            letters.listArr();
        }else if(position == 2){
            number.listArr();
        }
        else if (position == 3) {
            lettersNumbers.listArr();
        }else if (position == 4) {
            lettNumbSymb.listArr();
        }else{
            System.out.println("Number is error");
        }
        
     

        for (int j = 0; j < line; j++) {

            System.out.print(arr.get((int) (Math.random() * arr.size())));

        }
        System.out.println("");
    }

}
