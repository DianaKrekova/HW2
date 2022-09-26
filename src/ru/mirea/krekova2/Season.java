package ru.mirea.krekova2;

public enum Season {
    WINTER(-20),
    SPRING(15),
    SUMMER(20),
    AUTUM( 10);
    private int temperature;
    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public String getDescription(){
      String a="";
      if(temperature==-20 || temperature==10){
          a="Холодное время года";
      } else if (temperature==15 || temperature==20) {
          a="Tеплое время года";
      }
      return a;
    }
}
