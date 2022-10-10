public class Phones {

    private String color;
    private Integer releaseDate;
    private Integer memory;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Phones(String color, Integer releaseDate, Integer memory) {
        this.color = color;
        this.releaseDate = releaseDate;
        this.memory = memory;


    }
}

