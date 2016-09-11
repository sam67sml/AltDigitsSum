package ru.sberbank;

import java.io.*;
public class Solution
{

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //File file = new File("E:\\ÑáåðÒåõ\\Java school\\HelloWorld\\src\\ru\\sberbank\\input.txt");
        // FileReader fileReader = new FileReader(file);
        // BufferedReader br = new BufferedReader(fileReader);
        int count = Integer.parseInt(br.readLine());
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = new int[stringArray.length];
        int result = 0;
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
            if (i % 2 == 0)
                result += intArray[i];
            else result -= intArray[i];
        }
        if (intArray.length != count) System.out.println(-1);
        System.out.println(result);
    }
}