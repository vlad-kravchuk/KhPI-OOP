package laba3;
import java.util.*;
import java.util.Map.Entry;
 
public class laba3 
{
	private static final char[] line = "добрый день".toCharArray();
	
	//*******************************************************
	private static void printSymbols(final char[] line)
	{ //функция которая выводит нашу строку
		  for(int j = 0; j < line.length; j++)
		  {
	            System.out.print(line[j] + "    ");
	      }
    }
	//*********************************************************
	 private static void printSymbolNumbers(final char[] line) 
	 { //функция которая преобразовывает буквы в их порядковый номер в алфавите
		 char i = 0;
         int count = 0;
         HashMap<Integer, Character> words = new LinkedHashMap<>();
         for(i = '\u0430'; i < '\u044f'; i++)
         {
             count++;
             words.put(count, i);
         }
		 System.out.println("");
	        for(int k = 0; k < line.length; k++)
	        {
	            for(Entry<Integer, Character> abc: words.entrySet())
	            {
	                int key = abc.getKey();
	                char value = abc.getValue();
	                
	                if(line[k] == value)
	                {
	                    System.out.print(key + "    ");
	                }
	            }
	        }
	 }  
	 //***********************************************************
        public static void main(String[] args) //главная функция
        {
                printSymbols(line);
                printSymbolNumbers(line);
        }
}

