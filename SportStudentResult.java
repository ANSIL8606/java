interface Student {
int score=10;
void displayScore();
}
interface Sports {
int score=25;
void displaySportScore();
}
class Result implements Student,Sports {
public void displayScore() {
System.out.println("Academic_score_is_:_"+Student.score);
}
public void displaySportScore() {
System.out.println("Sport_score_is_:_"+Sports.score);
}
}
public class SportStudentResult {
public static void main(String []args) {
Result r=new Result();
r.displayScore();
r.displaySportScore();
}
}
