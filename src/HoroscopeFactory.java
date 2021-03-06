import java.util.ArrayList;
import java.util.Calendar;

/**
 * 星座占い作成クラス
 */
public class HoroscopeFactory {
    private static final String[] NAMES = {
            "おひつじ座",
            "おうし座",
            "ふたご座",
            "かに座",
            "しし座",
            "おとめ座",
            "てんびん座",
            "さそり座",
            "いて座",
            "やぎ座",
            "みずがめ座",
            "うお座"
    };

    /**
     * 占いの日付を指定して全ての星座占いを作成する
     *
     * @param calendar 占いの日付
     * @return 指定した日付の全ての星座
     */
    public static ArrayList<Horoscope> createAll(Calendar calendar) {
        ArrayList<Horoscope> horoscopes = new ArrayList<Horoscope>();
        for (String name : NAMES) {
            Horoscope horoscope = new Horoscope(name, calendar);
            horoscopes.add(horoscope);
        }
        return horoscopes;
    }
}
