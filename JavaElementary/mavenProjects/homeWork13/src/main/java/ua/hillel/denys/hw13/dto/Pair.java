package ua.hillel.denys.hw13.dto;

public class Pair {
    private String lover;
    private String upper;

    public Pair(String lover, String upper) {
        this.lover = lover;
        this.upper = upper;
    }

    public String getLover() {
        return lover;
    }

    public String getUpper() {
        return upper;
    }

    public void setLover(String lover) {
        this.lover = lover;
    }

    public void setUpper(String upper) {
        this.upper = upper;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "lover='" + lover + '\'' +
                ", upper='" + upper + '\'' +
                '}';
    }
}
