package app.veiw;

import java.util.Scanner;

public class AppView {




    public double getTemperature() {
        System.out.println("Введіть температуру повітря (від -10 до +35):");
        String inputText = new Scanner(System.in).next();
        return Double.parseDouble(inputText);
    }


    public void printReusltOfMeasurement(String temp){
        System.out.println("Температура становить: "+temp+" градусів");
    }

    public String getMenu(){
        System.out.println("""
                Виберіть функцію:
                    1)Провести вимірювання
                    0)Завершення програми
                """);
        return new Scanner(System.in).next();
    }

    public void hendelExeption(){
        System.out.println("Введено неправильну температуру");
    }

}
