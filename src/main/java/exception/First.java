package exception;

import java.nio.file.NotLinkException;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e){
            System.out.println("ДЕЛЕНИЕ НА 0!!! " + e.getClass());
        }

        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ВЫХОД ЗА ПРЕДЕЛЫ МАССИВА!!! " + e.getClass());
        }

        try {
            playWithNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Объект равен Null!! " + e.getClass());
        }

        try {
            tryToCreateFunnyArray();
        }catch (NegativeArraySizeException e) {
            System.out.println("Попытка создания массива с отрицательным размером! " + e.getClass());
        }

        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Выход индекса за пределы строки! " + e.getClass());
        }

        System.out.println("Ура! Меня снова печают");
    }


    public static void divideByZero() throws ArithmeticException {
        int a = 777 / (666 - 666);
    }

    // Изначально не вызывал исключения, изменил, чтобы вызывал исключение.
    public static void accessToUnexistingElement() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.printf("%d,", arr[i]);
        }
    }

    // Изначально не вызывал исключения, изменил, чтобы вызывал исключение.
    public static void playWithNullPointer() throws NullPointerException {
        String importantData = null;
        System.out.println("important is " + importantData.length());
    }

    public static void tryToCreateFunnyArray() throws NegativeArraySizeException {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() throws IndexOutOfBoundsException {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }
}
