public class Person {
    public static boolean isTeenager(int age) {
        boolean result;
        if (age < 19) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

//Отредактированный метод isTeenager() класса Person

/*public class Person {

    public static boolean isTeenager(int age) throws Exception {
        boolean result;
        if ((age <= 19) && (age >= 13)) {
            result = true;
        } else if ((age >= 0 && age < 13) || (age > 19 && age <= 118)) {
            result = false;
        } else {
            throw new Exception("Введено неверное значение возраста, повторите ввод");
        }
        return result;
    }
}*/
