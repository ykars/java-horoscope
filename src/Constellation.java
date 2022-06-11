import java.util.Calendar;
import java.util.Random;

/**
 * 星座占いクラス
 */
public class Constellation {
    private String name;
    private Calendar calendar;
    private Integer score;

    /**
     * コンストラクタ
     *
     * @param name     星座の名前
     * @param calendar 占いの日付
     */
    public Constellation(String name, Calendar calendar) {
        this.name = name;
        this.calendar = calendar;
        this.score = new Random().nextInt(100);
    }

    /********************
     * getter
     *******************/

    public String getName() {
        return name;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public Integer getScore() {
        return score;
    }
}
