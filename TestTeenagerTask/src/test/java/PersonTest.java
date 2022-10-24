import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class PersonTest {

    @DataProvider(name = "testData")
    Object[][] dataProvider() {
        return new Object[][]{
                {13, true, "positive #1:"}, // Нижняя граница
                {14, true, "positive #2:"}, // На один шаг выше нижней границы
                {16, true, "positive #3:"}, // Внутри позитивного класса
                {18, true, "positive #4:"}, // На один шаг ниже верхней границы
                {19, true, "positive #5:"}, // Верхняя граница
                {-1, false, "negative #6:"}, // Отрицательное значение возраста + внутри негативного класса
                {0, false, "negative #7:"}, // 0
                {12, false, "negative #8:"}, // На один шаг ниже нижней границы
                {20, false, "negative #9:"}, // На один шаг выше верхней границы
                {50, false, "negative #10:"}, // Внутри негативного класса
                {118, false, "negative #11:"},
                // Внутри негативного класса (может рассматриваться как граница для указания предельного знчения возраста)
                {69913012, false, "negative #12"} // Большое число (8 знаков), превышающее зафиксированный предельный возраст человека - опционально
        };
    }


    @Test(dataProvider = "testData")
    public void testIsTeenager(int arg1, boolean expected, String str1) throws Exception {
        boolean result = Person.isTeenager(arg1);
        System.out.println(str1 + " " + arg1 + " " + result);
        assertEquals(expected, result);
    }
}