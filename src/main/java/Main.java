import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать на гонки 24 часа Ле-Мана");
        String winner = "";
        for (int i = 1; i <= 3; i++) {
            String carmodel = scanner.next();
            System.out.println("Введите марку и модель " + i + "-й  машины");
            if (carmodel.isBlank()) {
                System.out.println("Невалидное значение. Введите верное значение - текст");
            }else{
                break;
            }
            int speed = scanner.nextInt();
            System.out.println("Введите скорость " + i + "-й машины");
            if (speed <= 0 || speed > 250 ) {
                System.out.println("Невалидное значение. Введите верное значение - целое число от 1 до 250");
            }else{
                break;
            }
            Race result = new Race();//этот кусок кода от ИИ - вызов метода и возврат строковой переменной
            winner = result.Trip24hours(carmodel,speed).toString();
        }
        System.out.println("Победитель гонки - " + winner);
        scanner.close();
    }
}
class Car {
    String carmodel;
    int speed;

   Car(String carmodel, int speed){
        this.carmodel = carmodel;
        this.speed = speed;
    }
}

class Race {
            int trip=0;
            String carmodel;

      public Object Trip24hours(String carmodel, int speed){
               if (trip<speed*24){
                   this.carmodel = carmodel;
                   trip=speed*24;
                   return carmodel;

               }else{
                   return null;
               }
     }
}


