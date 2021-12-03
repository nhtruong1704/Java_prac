package Prac9;

import java.util.*;

class Prac9 {
    public static void add(ArrayList<String> list) {
        String planet;
        System.out.println("Input name of planet");
        Scanner sc = new Scanner(System.in);
        planet = sc.nextLine();
        list.add(planet);
        System.out.println(list);
    }

    public static void delete(ArrayList<String> list) {
        int indexPlanet;
        System.out.println("Input index of planet you want to delete");
        Scanner sc = new Scanner(System.in);
        indexPlanet = Integer.parseInt(sc.nextLine());
        list.remove(indexPlanet);
        System.out.println(list);
    }

    public static void change(ArrayList<String> list) {
        int indexPlanet;
        String planet;
        System.out.println("Input index of planet you want to change and new name");
        Scanner sc = new Scanner(System.in);
        indexPlanet = Integer.parseInt(sc.nextLine());
        planet = sc.nextLine();
        list.set(indexPlanet, planet);
        System.out.println(list);
    }

    public static void showIndex(ArrayList<String> list) {
        String planet;
        System.out.println("Input name of planet you want to show index");
        Scanner sc = new Scanner(System.in);
        planet = sc.nextLine();
        System.out.println(list.indexOf(planet));
    }

    public static void check(ArrayList<String> list) {
        String planet;
        System.out.println("Input name of planet you want to check");
        Scanner sc = new Scanner(System.in);
        planet = sc.nextLine();
        System.out.println(list.indexOf(planet));
        boolean check;
        check = list.contains(planet);
        if (check) System.out.println("Exist");
        else System.out.println("not Exitst");
    }

    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        String pluton = new String("Плутон");

        Scanner sc = new Scanner(System.in);
        int n = 0;

        ArrayList<String> solarsystem_1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter));
        List<String> solarsystem_2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(saturn, uranus, neptune, pluton)));
        for (; ; ) {
            System.out.println("Chose your action \n 1.Show Planet  \n 2.Add planet \n 3.Delete planet \n 4.change planet \n 5.Show index \n 6. Check \n 7.Exit");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1 -> System.out.println(solarsystem_1);
                case 2 -> add(solarsystem_1);
                case 3 -> delete(solarsystem_1);
                case 4 -> change(solarsystem_1);
                case 5 -> showIndex(solarsystem_1);
                case 6 -> check(solarsystem_1);
                case 7 -> System.exit(0);
            }
        }

    }
}

