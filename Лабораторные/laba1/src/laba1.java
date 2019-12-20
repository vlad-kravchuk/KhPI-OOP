package laba1;

public class laba1 
{

	public static void main(String[] args) 
	{
		int A = 0x4655;
		long B = 380677916311L;
		int C = 0b1011;
		int D = 014247;
		int E = 5;
		String F = "E";
		
        System.out.println(B);
        System.out.println(E);
        System.out.println(F);
        
        String convert1 = Integer.toString(A);
        System.out.println(convert1);
        
        int rest = 0;
        int chet = 0;
        int nechet = 0;
        while (A != 0) 
        {
            rest = A % 10;
            A = A / 10;
            if (rest % 2 == 0)
                chet++;
            else 
                nechet++;
         }
        System.out.printf("Четных цифр: %d\n",chet);
        System.out.printf("Нечетных цифр: %d\n",nechet);
        
        String convert2= Integer.toString(C);
        System.out.println(convert2);
        
        String convert3 = Integer.toString(D);
        System.out.println(convert3);
        
        String convert4= Integer.toBinaryString(D);
        System.out.println(convert4);
        int c = 0;
        D = D - ((D >> 1) & 0x55555555);
        D = (D & 0x33333333) + ((D >> 2) & 0x33333333);
        c = ((D + (D >> 4) & 0xF0F0F0F) * 0x1010101) >> 24;
        System.out.printf("Количество единиц в числе Д: %d",c);
	}
}
