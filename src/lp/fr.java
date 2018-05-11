// Не забываем, что проект создается пакетом. В котором находятся файлики классы
package lp;
// Как всегда, импортируем библы. Библа ввода и вывода
import java.io.*;
import java.util.*;

// Создаем главный класс с модификатором доступа public.
// В котором объявим переменные. Что есть атрибуты класса
public class fr {
// Создаем метод (который ничего не возвращает). В данном методе инициализируем услувие проверки двух переменных
// введеных с клавиатуры. Для этого нам надо передать аргументы в метод
        void fr(int a, int b, int c){
//Собственно само условие. Если истина, то SOPом выводим сообщение об истенности
            if (a>b){
                 if (a>c){
                     System.out.println(Math.sqrt(a));
                 }
                System.out.println("Ye! it's variable larger");
            }
// Если ложь, то аналогично выводим SOPом сообщение о ложности условия
            else {
                System.out.println("No, var b larger =(");
            }
        }
// В главно методе с помощью конструктора создаем экземп. классов fr и Scanner. и организуем ввод значений с клавиатуры
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            fr f = new fr();
            //enter
        System.out.println("Enter a");
        int k = in.nextInt();
        System.out.println("Enter b");
        int l = in.nextInt();
        System.out.println("Enter c");
        int d = in.nextInt();
// Вызываем метод проверки условия с аргументами полученными из консоли
        f.fr(k,l,d);
        }
}
