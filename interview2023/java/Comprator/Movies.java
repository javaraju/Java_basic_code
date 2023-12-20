package interview2023.java.Comprator;

import java.util.Comparator;

public class Movies implements Comparator<Movies>{
    private Integer rate;
    private Integer year;
    private String name;

    public Movies() {
    }

    public Movies(Integer rate, Integer year, String name) {
        this.rate = rate;
        this.year = year;
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public Integer getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.name.compareTo(o2.name);
    }
}
