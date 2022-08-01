package baitap;

public class GoodStudent extends Student {
    private String gpa;
    private String bestRewardName;

    public GoodStudent() {
    }

    public GoodStudent(String excellent, String veryGood, String good, String passable, String gpa, String bestRewardName) {
        super(excellent, veryGood, good, passable);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "gpa=" + gpa +
                ",bestRewardName='" + bestRewardName + '\'' +
                '}';
    }

    @Override
    public void showMe() {
        System.out.println(this);

    }


}
