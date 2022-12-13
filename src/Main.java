public class Main {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta", "Россия", "Желтый", -23,2015);
        Car audi = new Car("Audi", "A8 50L TDI quattro", "Германия", "Черный", 3.0,-2015);
        Car BMW = new Car("BMW", "Z8", "Германия", "Черный", 3.0,2021);
        Car KIA = new Car("KIA", "Sportage 4-го поколения", "Южная Корея", "Красный", 2.4,2018);
        Car hyundai = new Car("Hyundai", "Avante", "Южная Корея", "Оранжевый", 1.6,2016);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(BMW);
        System.out.println(KIA);
        System.out.println(hyundai);

    }
}