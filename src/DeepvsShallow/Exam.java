package DeepvsShallow;

public class Exam {
    int examID;
    int score;

    public Exam(int examID, int score) {
        this.examID = examID;
        this.score = score;
    }
    public Exam(Exam other) {
        this.examID = other.examID;
        this.score = other.score;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
