package laba2;
import java.util.Random;
//��������� �������� �� �������� ����� �������
public class laba2 
{
	public static void main(String[] args)
	{
		int N = 15; //���������� ����� � �������
		int min = 10; //����������� ����� � ������ ��������� ��������� �����
		int max = 99; //����������� ����� � ������ ��������� ��������� �����
		String composite = "���������";
		String simple = "�������";
		int i=15;
		int j;
		boolean isComposite = false;
		System.out.printf("�����");
		System.out.printf("%30s%n", "��������� ��� �������\n");
		for(i = 0; i < N; i++) //���� ��� �������� �������
		{
			Random rnd = new Random(System.currentTimeMillis()); //��������� �����
			int n = min + rnd.nextInt(max - min + 1);
		    for (j = 2; j < n; j++)
		    {
			    if(n % j == 0) //���� ������� �� ������� 0, ����� ���������
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
