package enums;

public class FormatOldVersion {
    private  String format;

    public FormatOldVersion(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public static final FormatOldVersion BOOTCAMP=new FormatOldVersion("BOOTCAMP");
    public static final FormatOldVersion ODYNARY =new FormatOldVersion("ORDINARY");

}
