
public class Result {
    private String sex, country;
    private int year;
    private double literacyPercent;

    public Result(String sex, String country, int year, double literacyPercent) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return this.literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " 
                + this.sex + ", " + this.literacyPercent;
    }
}
