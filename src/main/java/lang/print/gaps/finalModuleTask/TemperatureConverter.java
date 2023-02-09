package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        //F = (C * 9/5) + 32
       int F = (temperatureCelsius * 9/5) + 32;
        System.out.println(F);
    }
}
