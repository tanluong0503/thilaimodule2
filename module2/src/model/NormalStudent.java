package baitap;

public class NormalStudent extends Student {
    private String englishScore;

    public NormalStudent() {
    }

    public NormalStudent(String excellent, String veryGood, String good, String passable, String englishScore) {
        super(excellent, veryGood, good, passable);
        this.englishScore = englishScore;
    }

    public String getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(String englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "englishScore=" + englishScore +
                '}';
    }

    @Override
    public void showMe() {
        System.out.println(this);

    }


}
