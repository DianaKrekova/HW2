import ru.mirea.krekova2.Season;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Season se = Season.SUMMER;
        switch (se){
            case WINTER:
                System.out.println("Я люблю зиму!");
                System.out.println("Температура: " + se.getTemperature());
                System.out.println(se.getDescription());
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                System.out.println("Температура: " + se.getTemperature());
                System.out.println(se.getDescription());
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                System.out.println("Температура: " + se.getTemperature());
                System.out.println(se.getDescription());
                break;
            case AUTUM:
                System.out.println("Я люблю осень!");
                System.out.println("Температура: " + se.getTemperature());
                System.out.println(se.getDescription());
                break;
        }
    }
}