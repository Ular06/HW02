public class Main {
    public static void main(String[] args) {


    }

    public static String createObject(String className) {
    

        Phones phones = new Phones("Black", 2020, 128);
        Apple apple = new Apple("White", 2019, 64);
        Samsung samsung = new Samsung("Red", 2017, 34);
        Xiaomi xiaomi = new Xiaomi("Blue", 2018, 16);


        switch (phones) {
            case 1:
                System.out.println(apple);
                break;
            case 2:
                System.out.println(samsung);
                break;
            case 3:
                System.out.println(xiaomi);

        }

    }
}

