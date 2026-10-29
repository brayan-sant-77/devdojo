package academy.devdojo.javacore.ZZDoptional.domain;

public class Manga {
    private String title;
    private Integer id;
    private int chapters;

    public Manga(String title, Integer id, int chapters) {
        this.title = title;
        this.id = id;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", chapters=" + chapters +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
