package laba5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class menu 
{
  public static void main(String[] args) throws IOException, ClassNotFoundException
  {
    int in=0;
    Scanner cin = new Scanner(System.in);
    int size = 0;
    ArrayList <String> arraylist = new ArrayList<String>();
    String string = new String();
    Scanner inn=new Scanner(System.in);
    
    do 
    {
      System.out.println("1. Заполнить контейнер");
      System.out.println("2. Вывести на экран содержимое контейнера");
      System.out.println("3. Функция toString()");
      System.out.println("4. Добавить элемент в конец");
      System.out.println("5. Очистить контейнер");
      System.out.println("6. Удалить элемент");
      System.out.println("7. Функция toArray()");
      System.out.println("8. Узнать размер");
      System.out.println("9. Contains(true, если в контейнере имеется такой элемент");
      System.out.println("10. ContainAll(true, если в контейнере имеются все такие элементы");
      System.out.println("11. Выход");
      System.out.println("В зависимости от того, что вы хотите, введите число:");
      in = cin.nextInt();
      switch (in) {
      case 1:
        System.out.println("Количество элементов в контейнере: ");
        size=cin.nextInt();
        
      for(int i=0;i<size;i++)
      {
        string=inn.nextLine();
        arraylist.add(string);
      }
        break;
      case 2:
        Iterator<String> iterator = arraylist.iterator();
        while(iterator.hasNext())
        {
          System.out.println(iterator.next());
        }
        break;
      case 3:
         System.out.println(arraylist.toString());
        break;
      case 4:
        Scanner inn1 = new Scanner(System.in);
        System.out.println("Введите новый элемент списка");
        string=inn1.nextLine();
        arraylist.add(string);
        break;
        
      case 5:
         arraylist.clear();
         System.out.println("Список был очищен.");
        break;
      case 6:
        
        string=inn.nextLine();
        arraylist.remove(string);
        break;
      case 7:
        String[] array = {}; 
        array = arraylist.toArray(new String[arraylist.size()]);
        for(String itter : array)
        {
          System.out.println(itter);
        }
        break;
      case 8:
        System.out.println("Размер - " + arraylist.size());
        break;
      case 9:
        string=inn.nextLine();
        System.out.println(arraylist.contains(string));
        break;
      case 10:
        ArrayList <String> arrlst = new ArrayList <String>();
        System.out.println("Введите количество элементов: ");
        size=cin.nextInt();
        
      for(int i=0;i<size;i++)
      {
        string=inn.nextLine();
        arrlst.add(string);
      }
      System.out.println(arraylist.containsAll(arrlst));
        break;
      default: {
        System.out.println("До встречи.");
      }

      }
    } while (in != 11);
  }
}