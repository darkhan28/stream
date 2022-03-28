import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Cars> car = new ArrayList<>();
        car.add(new Cars("BMW", "M5",260,  2006, 4.4, "diesel"));
        car.add(new Cars("MB", "E63", 250, 2009,5.5,"petrol"));
        car.add(new Cars("Lada", "Priora", 270, 2020,2.1,"petrol"));
        car.add(new Cars("Honda", "Civic", 190, 2010,2.0,"diesel"));
        car.add(new Cars("Toyota", "Supra", 260, 2004,3.5,"petrol"));
        car.add(new Cars("Kia", "K5", 200, 2020,2.5,"diesel"));
        car.add(new Cars("Toyota", "Camry", 210, 2015,2.5,"petrol"));



//        filter
        List<Cars> maxVolume = car.stream()
                        .filter(cars -> cars.volume>2.0)
                                .collect(Collectors.toList());
        maxVolume.forEach(cars -> System.out.println("Powerful car: "+cars.name));

//sort
        List<Cars> sorted=  car.stream()
                .sorted(Comparator.comparing(Cars::getYear))
                .collect(Collectors.toList());
        sorted.forEach(cars -> System.out.println(cars.year+" "+cars.model));
//All match
        boolean allMatch = car.stream()
                .allMatch(cars -> cars.maxSpeed>200);
        System.out.println(allMatch);
//Any match
        boolean anyMatch = car.stream()
                .anyMatch(cars -> cars.maxSpeed>200);
        System.out.println(anyMatch);
//// Max speed
//        car.stream()
//                .max(Comparator.comparing(Cars::getMaxSpeed))
//                .ifPresent(System.out::println);
// // Min volume
//        car.stream()
//                .min(Comparator.comparing(Cars::getVolume))
//                .ifPresent(System.out::println);
//Group
//        Map<String, List<Cars>> collect = car.stream()
//                .collect(Collectors.groupingBy(Cars::getFuel));
//        collect.forEach(((s, cars) -> {
//            System.out.println(collect);
//            cars.forEach(System.out::println);
//            System.out.println();
//        }));
//
//        Optional<Cars> fuel1 = (Optional<Cars>) car.stream()
//                .filter(cars -> cars.getFuel().equals("petrol"))
//                .max(Comparator.comparing(Cars::getMaxSpeed));
//        fuel1.ifPresent(System.out::println);
        Optional<Cars> volume1 = (Optional<Cars>) car.stream()
                .filter(cars -> cars.getVolume()>2.0)
                .max(Comparator.comparing(Cars::getYear));
        volume1.ifPresent(System.out::println);
        System.out.println("Beka esek");
        System.out.println(" ");
        System.out.println("Beka esek2");
        System.out.println("");









    }
}





//        Cars car3 = new Cars("Lada", "Priora", 183, 2007,1.6);
//        Cars car4 = new Cars("Honda", "Civic", 190, 2010,2.0);
//        Cars car5 = new Cars("Audi", "RS7", 235, 2013,4.2);
//        Cars car6 = new Cars("Toyota", "Supra", 260, 2004,3.5);
//        Cars car7 = new Cars("Kia", "K5", 200, 2020,2.5);
//        Cars car8 = new Cars("Toyota", "Camry", 210, 2015,2.5);
//        Cars car9 = new Cars("UAZ", "Patriot", 150, 2013,2.7);
//        Cars car10 = new Cars("Jac", "S7", 197, 2020,1.5);