package by.itstep.javatraining.revision.task;

/*	Task 09. The Count of Local Maximus [количество локальных максимумов]
 *
 *	Элемент последовательности называется локальным максимумом,
 *	если он строго больше предыдущего и последующего элемента
 *	последовательности. Первый и последний элемент последовательности
 *	не являются локальными максимумами по определению.
 *	Дано целое число. Необходимо подсчитать количество строгих локальных
 *	максимумов среди цифр заданного числа.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено количество строгих локальных максимумов.
 *
 *	[ input 1]: 2414241
 *	[output 1]: 3
 *
 *	[ input 2]: 131131
 *	[output 2]: 2
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -13245
 *	[output 4]: 1
 *
 *	[ input 5]: 12345
 *	[output 5]: 0
 */

public class Task09 {
    public static int task09(long number) {
        if (number < 0) {
            number = -number;
        }
        String lineNumber = String.valueOf(number);
        int count = 0;
        for (int i = 1; i < lineNumber.length() - 1; i++) {
            if (lineNumber.charAt(i) > lineNumber.charAt(i + 1)
                    && lineNumber.charAt(i) > lineNumber.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
