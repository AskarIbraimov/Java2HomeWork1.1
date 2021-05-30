package com.GeekTech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shelter romashka = new Shelter("Romashka",
                "Ibraimova 90");

        Dog sharik = new Dog();
        sharik.setShelter(romashka);
        Dog layka = new Dog("Layka ",
                "Чихуахуа", Color.BLACK, romashka);
        layka.setShelter(romashka);
        Dog barsik = new Dog("Barsik ",
                "Домашняя ", Color.BROWN, romashka,
                new String[]{"Стоять", "Сидеть"});
        barsik.setShelter(romashka);
        System.out.println(sharik.getInfo());
        System.out.println(layka.getInfo());
        System.out.println(barsik.getInfo());

        sharik.makeVoice("Gaw",2);
        layka.makeVoice(1,"Gav");
        barsik.makeVoice("АУФ");

        Профессия лекарь  = new Профессия("Лекарь");

        Пахан отец = new Пахан(50,"ВсеОтец",Должность.ДИРЕКТОР,"MMA","МС",10);
        System.out.println(отец.getInfo());
        Внук внук = new Внук(30,"Магни",Должность.НАЧАЛЬНИК,"Шахматы","КМС",5);
        Внук внук2 = new Внук(25,"Моди",Должность.ЗАМНАЧАЛЬНИК,"Борьба","КМС",10);
        внук.дело("Шахматы","КМС",5);
        System.out.println(внук2.getInfo());
    }
}
