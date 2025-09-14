import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Test laba1method = new Test();

        while (true) {
            System.out.println("\nМеню задач:");
            System.out.println("1 - задача 1.2 (сумма двух последних цифр)");
            System.out.println("2 - задача 1.4 (положительное ли число)");
            System.out.println("3 - задача 1.6 (заглавная ли буква)");
            System.out.println("4 - задача 1.8 (делитель)");
            System.out.println("5 - задача 1.10 (последовательное сложение последних цифр)");
            System.out.println("6 - задача 2.2 (безопасное деление)");
            System.out.println("7 - задача 2.4 (строка сравнения)");
            System.out.println("8 - задача 2.6 (сумма трёх чисел)");
            System.out.println("9 - задача 2.8 (год/года/лет)");
            System.out.println("10 - задача 2.10 (дни недели)");
            System.out.println("11 - задача 3.2 (числа от x до 0)");
            System.out.println("12 - задача 3.4 (x в степени y, y≥0)");
            System.out.println("13 - задача 3.6 (все цифры числа одинаковые)");
            System.out.println("14 - задача 3.8 (левый треугольник из '*')");
            System.out.println("15 - задача 3.10 (угадайка 0..9)");
            System.out.println("16 - задача 4.2 (последнее вхождение в массиве)");
            System.out.println("17 - задача 4.4 (вставка элемента в массив)");
            System.out.println("18 - задача 4.6 (реверс массива)");
            System.out.println("19 - задача 4.8 (объединение массивов)");
            System.out.println("20 - задача 4.10 (удалить отрицательные из массива)");
            System.out.println("0 - выход");
            System.out.print("Выберите номер задачи: ");

            int choice;
            try {
                choice = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Нужно ввести число.");
                in.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            try {
                switch (choice) {
                    case 1: // 1.2
                        System.out.println("Задача 1.2: сумма двух последних цифр числа.");
                        System.out.print("Введите число: ");
                        int num = in.nextInt();
                        int result = laba1method.sumLastNums(num);
                        System.out.println("Сумма = " + result);
                        break;

                    case 2: // 1.4
                        System.out.println("Задача 1.4: проверка, является ли число положительным.");
                        System.out.print("Введите число: ");
                        int num2 = in.nextInt();
                        boolean result2 = laba1method.isPositive(num2);
                        System.out.println("Положительное: " + result2);
                        break;

                    case 3: // 1.6
                        System.out.println("Задача 1.6: проверка, является ли символ заглавной буквой.");
                        System.out.print("Введите символ: ");
                        char ch = in.next().charAt(0);
                        boolean result3 = laba1method.isUpperCase(ch);
                        System.out.println("Заглавная: " + result3);
                        break;

                    case 4: // 1.8
                        System.out.println("Задача 1.8: проверка, делится ли одно число на другое.");
                        System.out.print("Введите число a: ");
                        int a = in.nextInt();
                        System.out.print("Введите число b: ");
                        int b = in.nextInt();
                        boolean result4 = laba1method.isDivisor(a, b);
                        System.out.println("Есть делимость: " + result4);
                        break;

                    case 5: // 1.10
                        System.out.println("Задача 1.10: последовательное сложение последних цифр пяти чисел.");
                        System.out.print("Введите первое число: ");
                        int n1 = in.nextInt();
                        System.out.print("Введите второе число: ");
                        int n2 = in.nextInt();
                        System.out.print("Введите третье число: ");
                        int n3 = in.nextInt();
                        System.out.print("Введите четвёртое число: ");
                        int n4 = in.nextInt();
                        System.out.print("Введите пятое число: ");
                        int n5 = in.nextInt();
                        int r1 = laba1method.lastNumSum(n1, n2);
                        int r2 = laba1method.lastNumSum(r1, n3);
                        int r3 = laba1method.lastNumSum(r2, n4);
                        int r4 = laba1method.lastNumSum(r3, n5);
                        System.out.println("Результат: " + r4);
                        break;

                    case 6: // 2.2
                        System.out.println("Задача 2.2: безопасное деление (если y = 0, вернуть 0).");
                        System.out.print("Введите x: ");
                        int x = in.nextInt();
                        System.out.print("Введите y: ");
                        int y = in.nextInt();
                        double result5 = laba1method.safeDiv(x, y);
                        System.out.println("Результат: " + result5);
                        break;

                    case 7: // 2.4
                        System.out.println("Задача 2.4: строка сравнения (x<y, x>y, x==y).");
                        System.out.print("Введите x: ");
                        int x2 = in.nextInt();
                        System.out.print("Введите y: ");
                        int y2 = in.nextInt();
                        String result6 = laba1method.makeDecision(x2, y2);
                        System.out.println("Результат сравнения: " + result6);
                        break;

                    case 8: // 2.6
                        System.out.println("Задача 2.6: проверка, дают ли два числа сумму третьего.");
                        System.out.print("Введите x: ");
                        int x3 = in.nextInt();
                        System.out.print("Введите y: ");
                        int y3 = in.nextInt();
                        System.out.print("Введите z: ");
                        int z3 = in.nextInt();
                        boolean result7 = laba1method.sum3(x3, y3, z3);
                        System.out.println("Результат: " + result7);
                        break;

                    case 9: // 2.8
                        System.out.println("Задача 2.8: возврат строки с возрастом (год/года/лет).");
                        System.out.print("Введите число: ");
                        int x4 = in.nextInt();
                        String result8 = laba1method.age(x4);
                        System.out.println("Возраст: " + result8);
                        break;

                    case 10: // 2.10
                        System.out.println("Задача 2.10: дни недели от введённого до воскресенья.");
                        System.out.print("Введите день недели (маленькими буквами): ");
                        String x5 = in.next();
                        laba1method.printDays(x5);
                        break;

                    case 11: // 3.2
                        System.out.println("Задача 3.2: вывести числа от x до 0.");
                        System.out.print("Введите число x: ");
                        int x6 = in.nextInt();
                        String result9 = laba1method.reverseListNums(x6);
                        System.out.println("Результат: " + result9);
                        break;

                    case 12: // 3.4
                        System.out.println("Задача 3.4: возведение в степень x^y (y ≥ 0).");
                        System.out.print("Введите число x: ");
                        int x7 = in.nextInt();
                        System.out.print("Введите число y: ");
                        int y7 = in.nextInt();
                        int result10 = laba1method.pow(x7, y7);
                        System.out.println("Результат: " + result10);
                        break;

                    case 13: // 3.6
                        System.out.println("Задача 3.6: проверка — все ли цифры числа одинаковые.");
                        System.out.print("Введите число: ");
                        int x8 = in.nextInt();
                        boolean result11 = laba1method.equalNum(x8);
                        System.out.println("Результат: " + result11);
                        break;

                    case 14: // 3.8
                        System.out.println("Задача 3.8: левый треугольник из '*'.");
                        System.out.print("Введите число x: ");
                        int x9 = in.nextInt();
                        laba1method.leftTriangle(x9);
                        break;

                    case 15: // 3.10
                        System.out.println("Задача 3.10: угадайка 0..9");
                        laba1method.guessGame();
                        break;

                    case 16: // 4.2
                        System.out.println("Задача 4.2: поиск последнего вхождения числа в массиве.");
                        System.out.print("Введите количество элементов массива: ");
                        int n = in.nextInt();
                        if (n <= 0) {
                            System.out.println("Ошибка: размер массива должен быть положительным!");
                            break;
                        }
                        int[] arr = new int[n];
                        System.out.println("Введите элементы массива:");
                        for (int i = 0; i < n; i++) {
                            arr[i] = in.nextInt();
                        }
                        in.nextLine(); // очищаем буфер
                        System.out.print("Введите число x: ");
                        int val = in.nextInt();
                        int idx = laba1method.findLast(arr, val);
                        System.out.println("Индекс последнего вхождения: " + idx);
                        break;

                    case 17: // 4.4
                        System.out.println("Задача 4.4: добавление числа в массив.");
                        System.out.print("Введите количество элементов массива: ");
                        int nn2 = in.nextInt();
                        int[] arr2 = new int[nn2];
                        System.out.println("Введите элементы массива:");
                        for (int i = 0; i < nn2; i++) {
                            arr2[i] = in.nextInt();
                        }
                        System.out.print("Введите число для вставки: ");
                        int val2 = in.nextInt();
                        System.out.print("Введите позицию вставки: ");
                        int pos = in.nextInt();
                        int[] newArr = laba1method.add(arr2, val2, pos);
                        System.out.print("Новый массив: ");
                        for (int i = 0; i < newArr.length; i++) {
                            System.out.print(newArr[i] + " ");
                        }
                        System.out.println();
                        break;

                    case 18: // 4.6
                        System.out.println("Задача 4.6: реверс массива.");
                        System.out.print("Введите количество элементов массива: ");
                        int nn3 = in.nextInt();
                        if (nn3 <= 0) {
                            System.out.println("Ошибка: размер массива должен быть положительным!");
                            break;
                        }
                        int[] arr3 = new int[nn3];
                        System.out.println("Введите элементы массива:");
                        for (int i = 0; i < nn3; i++) {
                            arr3[i] = in.nextInt();
                        }
                        laba1method.reverse(arr3);
                        System.out.print("Реверсированный массив: ");
                        for (int i = 0; i < arr3.length; i++) {
                            System.out.print(arr3[i] + " ");
                        }
                        System.out.println();
                        break;

                    case 19: // 4.8
                        System.out.println("Задача 4.8: объединение двух массивов.");
                        System.out.print("Введите количество элементов первого массива: ");
                        int nn4 = in.nextInt();
                        if (nn4 < 0) {
                            System.out.println("Ошибка: размер не может быть отрицательным.");
                            break;
                        }
                        int[] arr4 = new int[nn4];
                        System.out.println("Введите элементы первого массива:");
                        for (int i = 0; i < nn4; i++) {
                            arr4[i] = in.nextInt();
                        }
                        System.out.print("Введите количество элементов второго массива: ");
                        int nn5 = in.nextInt();
                        if (nn5 < 0) {
                            System.out.println("Ошибка: размер не может быть отрицательным.");
                            break;
                        }
                        int[] arr5 = new int[nn5];
                        System.out.println("Введите элементы второго массива:");
                        for (int i = 0; i < nn5; i++) {
                            arr5[i] = in.nextInt();
                        }
                        int[] res48 = laba1method.concat(arr4, arr5);
                        System.out.print("Объединённый массив: ");
                        for (int i = 0; i < res48.length; i++) {
                            if (i > 0) System.out.print(" ");
                            System.out.print(res48[i]);
                        }
                        System.out.println();
                        break;

                    case 20: // 4.10
                        System.out.println("Задача 4.10: удалить отрицательные числа из массива.");
                        System.out.print("Введите количество элементов массива: ");
                        int nn6 = in.nextInt();
                        if (nn6 < 0) {
                            System.out.println("Ошибка: размер массива не может быть отрицательным!");
                            break;
                        }
                        int[] arr6 = new int[nn6];
                        System.out.println("Введите элементы массива:");
                        for (int i = 0; i < nn6; i++) {
                            arr6[i] = in.nextInt();
                        }
                        int[] res410 = laba1method.deleteNegative(arr6);
                        System.out.print("Результат: ");
                        for (int i = 0; i < res410.length; i++) {
                            if (i > 0) System.out.print(" ");
                            System.out.print(res410[i]);
                        }
                        System.out.println();
                        break;

                    default:
                        System.out.println("Такой задачи нет.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Ввод некорректен.");
                in.nextLine();
            }
        }
    }
}
