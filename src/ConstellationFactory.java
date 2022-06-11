import java.util.ArrayList;
import java.util.Calendar;

/**
 * 星座占い作成クラス
 */
public class ConstellationFactory {
    // 星座名一覧
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
    public static ArrayList<Constellation> createAll(Calendar calendar) {
        ArrayList<Constellation> constellations = new ArrayList<Constellation>();
        for (String name : NAMES) {
            Constellation constellation = new Constellation(name, calendar);
            constellations.add(constellation);
        }
        return constellations;
    }
}
