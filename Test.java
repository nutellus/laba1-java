public class Test {

    // 1.2 — сумма двух последних цифр числа
    public int sumLastNums(int x) {
        int absX = Math.abs(x);
        int last = absX % 10;
        int preLast = (absX / 10) % 10;
        return last + preLast;
    }


    // 1.4 — положительное ли число
    public boolean isPositive (int x) {
        return x > 0;
    }

    // 1.6 — заглавная ли буква
    public boolean isUpperCase (char x) {
        return x >= 'A' && x <= 'Z';
    }

    // 1.8 — делится ли одно число на другое
    public boolean isDivisor (int a, int b) {
        return b != 0 && a % b == 0;
    }

    // 1.10 — сумма последних цифр двух чисел
    public int lastNumSum(int a, int b) {
        int lastA = a % 10;
        int lastB = b % 10;
        return lastA + lastB;
    }


    // 2.2 — безопасное деление (если y = 0, вернуть 0)
    public double safeDiv (int x, int y) {
        if (y == 0) {
            return 0;
        }
        else {
            return (double)x/y;
        }
    }

    // 2.4 — строка сравнения (x<y, x>y, x==y)
    public String makeDecision (int x, int y) {
        String m = "<";
        String b = ">";
        String r = "==";
        if (x > y) {
            return x + b + y;
        }
        else if (x < y) {
            return x + m + y;
        }
        else {
            return x + r + y;
        }
    }

    // 2.6 — проверка, дают ли два числа сумму третьего
    public boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        }
        if (x + z == y) {
            return true;
        }
        if (y + z == x) {
            return true;
        }
        return false;
    }


    // 2.8 — вернуть строку возраста с правильным словом (год/года/лет)
    public String age(int x) {
        if (x < 0) {
            return "возраст не может быть отрицательным!";
        }
        int last = x % 10;
        int last2 = x % 100;
        if (last2 >= 11 && last2 <= 14) {
            return x + " лет";
        } else if (last == 1) {
            return x + " год";
        } else if (last == 2 || last == 3 || last == 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }


    // 2.10 — вывести дни недели от введённого до воскресенья
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели!");
        }
    }


    // 3.2 — вернуть строку чисел от x до 0
    public String reverseListNums(int x) {
        if (x < 0) {
            return ("Число x должно быть больше нуля!");
        }
        String res = "";
        for (int i = x; i >= 0; i--) {
            if (i != x) {
                res = res + " ";
            }
            res = res + i;
        }
        return res;
    }

    // 3.4 — x в степени y (y >= 0)
    public int pow(int x, int y) {
        if (y < 0) {
            System.out.println("Ошибка: степень должна быть неотрицательной");
            return 0;
        }
        int res = 1;
        for (int i = 0; i < y; i++) {
            res = res * x;
        }
        return res;
    }

    // 3.6 — все ли цифры числа одинаковые
    public boolean equalNum(int x) {
        x = Math.abs(x);
        int lastd = x % 10;
        while (x > 0) {
            int currentd = x % 10;
            if (currentd != lastd) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    // 3.8 — левый треугольник из '*'
    public void leftTriangle(int x) {
        if (x <= 0) {
            System.out.println("Ошибка: число должно быть положительным!");
            return;
        }
        for (int i = 1; i <= x; i++) {
            String row = "";
            for (int j = 0; j < i; j++) {
                row = row + "*";
            }
            System.out.println(row);
        }
    }

    // 3.10 — угадайка 0..9 (ввод/вывод внутри метода)
    public void guessGame() {
        java.util.Random rnd = new java.util.Random();
        java.util.Scanner in = new java.util.Scanner(System.in);

        int secret = rnd.nextInt(10);
        int attempts = 0;

        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            int guess;
            try {
                guess = in.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка! Нужно ввести целое число от 0 до 9.");
                in.nextLine();
                continue;
            }
            if (guess < 0 || guess > 9) {
                System.out.println("Ошибка! Диапазон 0..9.");
                continue;
            }
            attempts++;
            if (guess == secret) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + attempts + " попытки");
                break;
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        }
    }


    // 4.2 — индекс последнего вхождения x в массиве (или -1)
    public int findLast(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 4.4 — вставить x в позицию pos, вернуть новый массив
    public int[] add(int[] arr, int x, int pos) {
        if (arr == null) {
            return new int[]{x};
        }
        if (pos < 0 || pos > arr.length) {
            return arr;
        }
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        res[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            res[i + 1] = arr[i];
        }
        return res;
    }

    // 4.6 — развернуть массив на месте (in-place)
    public void reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    // 4.8 — конкатенация двух массивов
    public int[] concat(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return new int[0];
        }
        if (arr1 == null) {
            return arr2.clone();
        }
        if (arr2 == null) {
            return arr1.clone();
        }
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[arr1.length + i] = arr2[i];
        }
        return res;
    }

    // 4.10 — удалить все отрицательные элементы из массива
    public int[] deleteNegative(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int[] res = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
}
