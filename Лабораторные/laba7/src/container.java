package laba7;

import java.util.Arrays;

class Container {

    private final int size = 10;

    private int count = 0;

    private Directory[] mass = new Directory[size];


    void add(final Directory temp){
        if (count == mass.length) {
            mass = Arrays.copyOf(mass, mass.length * 2);
            mass[count++] = temp;
        } else {
            mass[count++] = temp;
        }
    }

    void show() {
        if (count == 0) {
            System.out.println("������! ������ ������!");
        } else {
            System.out.println();
            for (int i = 0; i < count; i++) {
                System.out.println("������� #" + (i+1));
                System.out.println("��������: " + mass[i].getStore());
                System.out.println("�����: " + mass[i].getAddress());
                System.out.println("�������: " + mass[i].getPhone());
                System.out.println("�������������: " + mass[i].getSpecialization());
                System.out.println("����� ������: " + mass[i].getWork_time());
            }
        }
    }

    void clear() {
        for (int i = 0; i < count; i++) {
            mass[i] = null;
        }
        count = 0;
    }

    public void remove(int index) {
        for (int i = index; i < count; i++) {
            mass[index++] = mass[i + 1];
        }
        count--;
    }
}

