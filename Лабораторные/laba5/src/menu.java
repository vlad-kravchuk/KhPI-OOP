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
      System.out.println("1. ��������� ���������");
      System.out.println("2. ������� �� ����� ���������� ����������");
      System.out.println("3. ������� toString()");
      System.out.println("4. �������� ������� � �����");
      System.out.println("5. �������� ���������");
      System.out.println("6. ������� �������");
      System.out.println("7. ������� toArray()");
      System.out.println("8. ������ ������");
      System.out.println("9. Contains(true, ���� � ���������� ������� ����� �������");
      System.out.println("10. ContainAll(true, ���� � ���������� ������� ��� ����� ��������");
      System.out.println("11. �����");
      System.out.println("� ����������� �� ����, ��� �� ������, ������� �����:");
      in = cin.nextInt();
      switch (in) {
      case 1:
        System.out.println("���������� ��������� � ����������: ");
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
        System.out.println("������� ����� ������� ������");
        string=inn1.nextLine();
        arraylist.add(string);
        break;
        
      case 5:
         arraylist.clear();
         System.out.println("������ ��� ������.");
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
        System.out.println("������ - " + arraylist.size());
        break;
      case 9:
        string=inn.nextLine();
        System.out.println(arraylist.contains(string));
        break;
      case 10:
        ArrayList <String> arrlst = new ArrayList <String>();
        System.out.println("������� ���������� ���������: ");
        size=cin.nextInt();
        
      for(int i=0;i<size;i++)
      {
        string=inn.nextLine();
        arrlst.add(string);
      }
      System.out.println(arraylist.containsAll(arrlst));
        break;
      default: {
        System.out.println("�� �������.");
      }

      }
    } while (in != 11);
  }
}