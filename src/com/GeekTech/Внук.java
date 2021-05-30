package com.GeekTech;

public final class Внук extends Пахан {

    private String образование;
    private Профессия профессия;

    public Внук(int age, String name, Должность должность, String спорт, String звание, int время) {
        super(age, name, должность, спорт, звание, время);
    }

    public Профессия getПрофессия() {
        return профессия;
    }



    public String getОбразование() {
        return образование;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Образование: " + getОбразование() + getПрофессия() ;
    }
}
