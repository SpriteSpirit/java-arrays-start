**Задача 1**

Объявите три массива:

1. Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.

**Подсказка**

_Объявление массива из 12 элементов, заполненного нулями:
int [] weight = new int [12];_

2. Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.

**Подсказка**

_Объявление целочисленного массива, заполненного 12 элементами:
int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};_

3. Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

**Задача 2**
Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.

**Задача 3**

Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
Если в задаче № 2 в консоль у вас вывелся результат:

1, 2, 3
1.57, 7.654, 9.986
// произвольные элементы третьего массива

то в этой задаче результат должен быть таким:

3, 2, 1
9.986, 7.654, 1.57
// произвольные элементы третьего массива в обратном порядке

**Задача 4**

Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
Распечатайте результат преобразования в консоль.

**Подсказка**

Если формат вывода элементов массива в консоль не важен, то распечатайте элементы массива с помощью метода Arrays.toString ().
Для этого после объявления и инициализации массива напишите команду System.out.println, внутри нее — Arrays.toString, в круглых скобках которого укажите имя массива:

int [] arr = {1, 2, 3};
System.out.println(Arrays.toString(arr));

Метод выводит элементы массива одной строчкой через запятую в квадратных скобках:

[1, 2, 3]

Подробнее о методе Arrays.toString рассказывается в шпаргалке.
