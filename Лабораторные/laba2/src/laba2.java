package laba2;
import java.util.Random;
//проверить является ли заданное число простым
public class laba2 
{
	public static void main(String[] args)
	{
		int N = 15; //количество строк в таблице
		int min = 10; //минимальное число в рамках случайной генерации чисел
		int max = 99; //максимально число в рамках случайной генерации чисел
		String composite = "составное";
		String simple = "простое";
		int i=15;
		int j;
		boolean isComposite = false;
		System.out.printf("Число");
		System.out.printf("%30s%n", "Составное или простое\n");
		for(i = 0; i < N; i++) //цикл для создания таблицы
		{
			Random rnd = new Random(System.currentTimeMillis()); //случайное число
			int n = min + rnd.nextInt(max - min + 1);
		    for (j = 2; j < n; j++)
		    {
			    if(n % j == 0) //если остаток от деления 0, число составное
			    {
				    isComposite = true;
			    }
		    }
			if(isComposite == true)
			{
				System.out.printf("%d %26s%n",n, composite);
				isComposite = false;
			}
			else
			{
				System.out.printf("%d %26s%n",n, simple);
			}
		}
		
	}
}
