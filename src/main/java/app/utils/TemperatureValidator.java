package app.utils;

import app.ecxeptions.TemperatureEcxeption;

public class TemperatureValidator {

    public  boolean doValidation (double temperature) {
        try {
            if(temperature>35 | temperature<-10){
                throw new TemperatureEcxeption(" Помилка вимірювань температура вийшла за межі " +
                        "діапазону від -10 до 35");
            }
            return true;
        }catch (TemperatureEcxeption e){
            return false;
        }

    }

}
