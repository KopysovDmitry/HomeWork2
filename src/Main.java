package ru.skyeng;

public class Main {

    public static void main(String[] args) {

        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("Задача №2");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Задача №3");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 4;
        System.out.println(friend);
        System.out.println("Задача №4");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача №4");
        var boxer1Weight = 78.2;
        System.out.println(boxer1Weight);
        var boxer2Weight = 82.7;
        System.out.println(boxer2Weight);
        var AllBoxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Сумма веса обоих боксеров равна "+ AllBoxersWeight + " Кг!");
        var BoxersDifference = (boxer2Weight + boxer1Weight) % boxer1Weight;
        System.out.println("Разница между боксерами равна " + BoxersDifference + " Кг!");
        System.out.println("Задача №5");
        System.out.println("боксер 2 тяжелее боксера 1 на " + (boxer2Weight - boxer1Weight) +" кг!");
        System.out.println("боксер 2 тяжелее боксера 1 на " + (boxer2Weight + boxer1Weight) % boxer1Weight +" кг!");
        System.out.println("Задача №7");
        var AllTimeWorkers = 640;
        var TimeOfDayWorker = 8;
        var NumberOfWorkers = AllTimeWorkers/TimeOfDayWorker;
        System.out.println("Колчичество работников " + NumberOfWorkers);
        NumberOfWorkers = NumberOfWorkers +94;
        AllTimeWorkers = NumberOfWorkers * TimeOfDayWorker;
        System.out.println("Если в компании работает " + NumberOfWorkers + " человек, то всего "  + (TimeOfDayWorker * NumberOfWorkers) +" часов работы может быть поделено между сорудниками");
        System.out.println("___________");

    }
}