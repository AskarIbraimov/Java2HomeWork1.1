package com.GeekTech;

public class Пахан extends Дед {
    private String спорт;
    private String звание;
    private int время;

    public Пахан(int age, String name, Должность должность, String спорт, String звание, int время) {
        super(age, name, должность);
        this.спорт = спорт;
        this.звание = звание;
        this.время = время;
    }

    public String getСпорт() {
        return спорт;
    }

    public String getЗвание() {
        return звание;
    }

    public int getВремя() {
        return время;
    }


    public void дело(String cпорт, String звание){
        System.out.println("Вид Спорта: " + спорт + "Звание: " + звание);
    }
    public void дело (String спорт,int время){
        System.out.println("Вид Спорта: " + спорт + " Лет в спорте: " + время);
    } public void дело (String спорт, String звание,int время){
        System.out.println("Вид Спорта: " + спорт + " Звание: " + звание + " Лет в спорте: " + время);
    }

    public String getInfo(){
        return "Age: " + getAge() + " Name: " + getName() + " Должность: " +
                getДолжность() + " Спорт: " + спорт + " Звание: " + getЗвание() + " Лет в спорте: " + getВремя();
    }

}
