package baitap;

public abstract class Student {

    private String fullName;
    private String doB;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;
    private String excellent;
    private String veryGood;
    private String good;
    private String passable;

    public Student() {
    }

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName,
                   String gradeLevel, String excellent, String veryGood, String good, String passable) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
        this.excellent = excellent;
        this.veryGood = veryGood;
        this.good = good;
        this.passable = passable;
    }

    public Student(String excellent, String veryGood, String good, String passable) {
        this.excellent = excellent;
        this.veryGood = veryGood;
        this.good = good;
        this.passable = passable;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;

    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;

    }

    public String getGradeLevel() {
        return gradeLevel.equals("0") ? "GOODSTUDENT" : gradeLevel.equals("1") ? "NORMALSTUDENT" : "INVALID!";
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getExcellent() {
        return excellent;
    }

    public void setExcellent(String excellent) {
        this.excellent = excellent;
    }

    public String getVeryGood() {
        return veryGood;
    }

    public void setVeryGood(String veryGood) {
        this.veryGood = veryGood;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getPassable() {
        return passable;
    }

    public void setPassable(String passable) {
        this.passable = passable;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", excellent='" + excellent + '\'' +
                ", veryGood='" + veryGood + '\'' +
                ", good = '" + good + '\'' +
                ", passable='" + passable + '\'' +
                '}';
    }

    public abstract void showMe();

}


