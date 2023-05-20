package by.itstep.javatraining.revision.task;

/*	Task 05. Max Number Digit [максимальная цифра числа]
 *
 *	Дано целое число. Необходимо найти максимальную цифру заданного числа
 *	с использованием эффективного алгоритма.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должна быть возвращена максимальная цифра числа.
 *
 *	[ input 1]: 987_654_321
 *	[output 1]: 9
 *
 *	[ input 2]: 12345
 *	[output 2]: 5
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -15
 *	[output 4]: 5
 */


public class Task05 {
    public static int task05(long number) {
        if (number < 0) {
            number = -number;
        }
        int max = (int) number / 10 % 10;

        while (number > 0) {
            long digit = number % 10;
            if (digit > max) {
                max = (int) digit;
            }
            number /= 10;
        }
        return max;
    }
    // second option
//        String lineNumber = String.valueOf(number);
//       char maxTemp = lineNumber.charAt(0);
//        for (int i = 0; i < lineNumber.length(); i++) {
//            if(maxTemp < lineNumber.charAt(i)){
//                maxTemp = lineNumber.charAt(i);
//            }
//        }
//        return Character.getNumericValue(maxTemp);
//    }
}