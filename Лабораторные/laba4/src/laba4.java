import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class laba4 {

	private static final char[] line = "добрый день".toCharArray();

	public static void main(String[] args) {

		boolean dbg_1 = true;
		boolean dbg_2 = false;

		char[] keys1 = { 'h', 'e', 'l', 'p' };
		char[] keys2 = { 's', 't', 'a', 'r', 't' };
		char[] keys3 = { 'd', 'e', 'b', 'u', 'g' };

		for (int i = 0; i < args.length && i < keys1.length; i++) {
			if (args[i].charAt(0) == keys1[i]) {
				System.out.println("Help.\n" + "Автор: Кравчук В.П. Группа: КИТ-101.8а \n"
						+ " Программа предназначена для перевода букв в их порядковый номер в алфавите");
			}
		}

		for (int i = 0; i < args.length && i < keys2.length; i++) {
			if (args[i].charAt(0) == keys2[i]) {
				System.out.println("Start.");
				menu(dbg_2, line);
			}
		}

		for (int i = 0; i < args.length && i < keys3.length; i++) {
			if (args[i].charAt(0) == keys3[i]) {
				System.out.println("Debug");
				menu(dbg_1, line);
			}
		}

	}

	public static int menu(boolean debug, final char[] line) {
		if (debug == true) {
			System.out.println("Метод menu");
			System.out.println("Переменных: \n int num - Выбор пунктов меню" + "\n Scanner scn - Ввод команд"
					+ "\n String line - Наша строка");
		}
		Scanner scn = new Scanner(System.in);
		int num = -1;
		System.out.println("1.Заполнение строки");
		System.out.println("2.Просмотр данных");
		System.out.println("3.Преобразование букв в их порядковый номер в алфавите");
		System.out.println("4.Возврат в главное меню");
		System.out.println("0.Выход");
		do {
			while (num < 0 || num > 5) {
				if (num < -1 || num > 5)
					System.out.println("Такой команды нет.");
				System.out.print("Введите номер команды: ");
				num = scn.nextInt();
			}
			switch (num) {
			case 1:
				if (debug == true) {
					System.out.println("Состояние num: " + num);
				}
				System.out.println("Загрузка строки...");
				System.out.print("Строка заполнена!\n");
				num = -1;
				break;
			case 2:
				if (debug == true) {
					System.out.println("Состояние num: " + num);
				}
				for (int j = 0; j < line.length; j++) {
					System.out.print(line[j] + "    ");
				}
				System.out.print("\n");
				num = -1;
				break;
			case 3:
				if (debug == true) {
					System.out.println("Состояние num: " + num);
				}
				System.out.println("Выполнение...");
				if (debug == true) {
					System.out.println("Вызов метода Translating");
				}
				Translating(line, debug);
				num = -1;
				break;
			case 4:

				System.out.println("Выходим...");
				return 1;

			case 0:
				if (debug == true) {
					System.out.println("Состояние num: " + num);
				}
				System.out.println("Выход...");
				if (debug == true) {
					System.out.println("Метод menu завершился");
				}
				System.out.println("Программа завершила свою работу.");
				System.exit(0);
			}

		} while (num != 0);
		return 0;
	}

	public static void Translating(final char[] line2, boolean debug) {
		char i = 0;
		int count = 0;
		HashMap<Integer, Character> words = new LinkedHashMap<>();
		for (i = '\u0430'; i < '\u044f'; i++) {
			count++;
			words.put(count, i);
		}
		System.out.println("");
		for (int k = 0; k < line2.length; k++) {
			for (Entry<Integer, Character> abc : words.entrySet()) {
				int key = abc.getKey();
				char value = abc.getValue();

				if (debug == true) {
					System.out.println("Ключи: " + key);
				}

				if (line2[k] == value) {
					System.out.print(key + "    ");
					if(debug == true)
					{
						System.out.print("\n");
					}
				}
			}
		}
		System.out.print("\n");
	}
}
