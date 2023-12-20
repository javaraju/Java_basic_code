package interview2023.java.Comprable;

public class Movies implements Comparable<Movies>{
    private int rate;
    private int year;
    private String name;

    public Movies() {
    }

    public Movies(int rate, int year, String name) {
        this.rate = rate;
        this.year = year;
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Movies movies){
//        return movies.getYear() - this.year;
        return -this.getName().compareTo(movies.getName());
    }
}
