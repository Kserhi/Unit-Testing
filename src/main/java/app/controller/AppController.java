package app.controller;

import app.model.AppModel;
import app.utils.TemperatureValidator;
import app.veiw.AppView;

public class AppController {
    AppModel appModel;
    AppView appView;

    TemperatureValidator temperatureValidator;
    public AppController() {
        this.appModel = new AppModel();
        this.appView = new AppView();
        this.temperatureValidator=new TemperatureValidator();
    }

    public void run(){
        switch (appView.getMenu()){
            case "1"->{
                double temp=appView.getTemperature();
                if (temperatureValidator.doValidation(temp)){
                    String result=appModel.doMeasurements(temp);
                    appView.printReusltOfMeasurement(result);
                    run();
                }else {
                    appView.hendelExeption();
                    run();
                }
            }
            case "0"->
                System.exit(0);
        }
    }

}
