package subarray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static subarray.Result.shortarray;

public class Solution {

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();


        for(int i =0; i< index; i++)
        {
           list.add(sc.nextInt());
        }

        System.out.println(shortarray(list));
    }

}
