/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Prashanth
 */
public class oddoreven {
    
    public static void main(String[] args) throws IOException{
    int no;
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Give the input --> ");
    no=Integer.parseInt(br.readLine());
    if((2%no)==0)
    {
        System.out.println("The input last Given was an Even No.");
    }
    else{
        System.out.println("The input last Given was an Odd No.");
    }
    
    }   
}