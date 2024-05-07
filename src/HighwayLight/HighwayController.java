package HighwayLight;

public class HighwayController {
    private int switch1, switch2, lampState;
    public HighwayController(){
        switch1 = 0;
        switch2 = 0;
        findLampstate();
    }
    public HighwayController(int switch1, int switch2){
        this.switch1 = switch1;
        this.switch2 = switch2;
        findLampstate();
    }
    private void findLampstate(){

         lampState = (switch1 ^ switch2);

    }
    public void toggleSwitch1(){
        switch1 = ( 1 - switch1);
    }
    public void toggleSwitch2(){
        switch2 = ( 1 - switch2);
    }
    public int getSwitch1(){
        return switch1;
    }
    public int getSwitch2(){
        return switch2;
    }
    public int getLampState(){
        return lampState;
    }

}
