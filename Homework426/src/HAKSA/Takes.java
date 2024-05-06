package HAKSA;

public class Takes {
    private String id;		//학번
    private String subject;	//과목코드
    private String score;	//점수

    public Takes() {

    }

    public Takes(String id, String subject, String score) {
        this.id = id;
        this.subject = subject;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return " [id=" + id + ", subject=" + subject + ", score=" + score + "]";

    }
}
