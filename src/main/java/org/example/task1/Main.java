package org.example.task1;
/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter a list of integers: ");
        String line = input.nextLine();
        while (!line.isEmpty()) {
            int num = Integer.parseInt(line);
            list.add(num);
            line = input.nextLine();
        }

        System.out.println("The original list: " + list);

        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("The new list: " + reversedList);
    }
}
