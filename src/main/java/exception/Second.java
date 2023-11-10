package exception;

public class Second {

    public static void main(String[] args) {
        tryValidateInput("success_input");
        System.out.println();
        tryValidateInput("errorInput1");
        System.out.println();
        tryValidateInput("error_input_№1231231231321313123");
        System.out.println();
        tryValidateInput(null);
        System.out.println();
        try {
            int val = canThrowsNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Неверная строка для каста к числу!");
        }
        System.out.println();

        try {
            canThrowsIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка аргументов, причина: " + e);
        }
        System.out.println();
        System.out.println("Все ошибки обработаны!");
        // todo write demo
    }

    private static void tryValidateInput(String input) {
        try {
            validateInput(input);
            System.out.println("Input = " + input + " is Valid!");
        } catch (InputException e) {
            System.out.println("Input = " + input + " is NOT VALID, BECAUSE:");
            System.out.println(e.getMessage());
        }
    }

    private static void validateInput(String input) throws InputException {
        if (input == null || input.length() > 14 || !input.contains("_")) {
            throw new InputException("Ввод должен иметь длину 14 или меньше и содержать символ \"_\"");
        }
    }

    private static int canThrowsNumberFormatException() throws NumberFormatException {
        String str = "str";
        return Integer.parseInt(str);
    }

    private static void canThrowsIllegalArgumentException() throws IllegalArgumentException {
        Point p = new Point(-1, 1);
    }

}
