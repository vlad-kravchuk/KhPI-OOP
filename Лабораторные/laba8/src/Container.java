package laba8;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import laba8.Directory;

class Container implements Serializable {

	private final int size = 10;

	private int count = 0;

	private Directory[] mass = new Directory[size];

	void add(final Directory temp) {
		Directory buff = new Directory(temp);
		if (count == mass.length) {
			mass = Arrays.copyOf(mass, mass.length * 2);
			mass[count++] = buff;
		} else {
			mass[count++] = buff;
		}
	}

	void save() {
		try {
			File file = new File("save.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			System.out.println();
			for (int i = 0; i < count; i++) {
				pw.println(count);
				pw.println(mass[i].getStore());
				pw.println(mass[i].getAddress());
				pw.println(mass[i].getPhone());
				pw.println(mass[i].getSpecialization());
				pw.println(mass[i].getWork_time());
			}
			pw.close();
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
	}

	void save(final String str) {
		try {
			File file = new File(str);
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			System.out.println();
			for (int i = 0; i < count; i++) {
				pw.println(count);
				pw.println(mass[i].getStore());
				pw.println(mass[i].getAddress());
				pw.println(mass[i].getPhone());
				pw.println(mass[i].getSpecialization());
				pw.println(mass[i].getWork_time());
			}
			pw.close();
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
	}

	void read() throws IOException {
		BufferedReader br = null;
		Directory temp = new Directory();
		try {
			br = new BufferedReader(new FileReader("save.txt"));
			String line;
			line = br.readLine();
			count = Integer.parseInt(line);
			for (int i = 0; i < count; i++) {
				line = br.readLine();
				temp.setStore(line);
				line = br.readLine();
				temp.setAddress(line);
				line = br.readLine();
				temp.setPhone(line);
				line = br.readLine();
				temp.setSpecialization(line);
				line = br.readLine();
				temp.setWork_time(line);

				mass[i] = new Directory(temp);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			br.close();
		}
	}

	void show() {
		if (count == 0) {
			System.out.println("Ошибка! Пустой массив!");
		} else {
			System.out.println();
			for (int i = 0; i < count; i++) {
				System.out.println("Магазин #" + (i + 1));
				System.out.println("Название: " + mass[i].getStore());
				System.out.println("Адрес: " + mass[i].getAddress());
				System.out.println("Телефон: " + mass[i].getPhone());
				System.out.println("Специализация: " + mass[i].getSpecialization());
				System.out.println("Время работы: " + mass[i].getWork_time());
			}
		}
	}

	void clear() {
		for (int i = 0; i < count; i++) {
			mass[i] = null;
		}
		count = 0;
	}

	public void remove(final int index) {
		int temp = index;
		for (int i = temp; i < count; i++) {
			mass[temp++] = mass[i + 1];
		}
		mass[count] = null;
		count--;
	}

	int size() {
		return count;
	}
}
