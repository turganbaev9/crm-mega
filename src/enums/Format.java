package enums;

public enum Format {

    ORDYNARY("Обычный курс"),
    BOOTCAMP("Ускоренный лагерь");

    private String a;

    Format(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
}
