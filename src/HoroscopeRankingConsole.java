import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

/**
 * 星座占いランキングのコンソール出力クラス
 */
public class HoroscopeRankingConsole implements IHoroscopeRankingPrinter {
    @Override
    public void print(ArrayList<Horoscope> horoscopes, Calendar calendar) {
        // ソート用の比較オブジェクトを用意
        Comparator<Horoscope> comparator = new Comparator<Horoscope>() {
            @Override
            public int compare(Horoscope hs1, Horoscope hs2) {
                return hs1.getScore().compareTo(hs2.getScore());
            }
        };

        // ソート
        Collections.sort(horoscopes, comparator);

        // 日付を出力
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("----- " + dateFormatter.format(calendar.getTime()) + " 星座占い -----");

        // ランキングを出力
        int rank = 1;
        for (Horoscope horoscope : horoscopes) {
            String line = String.format("第%d位: %s (スコア: %d)", rank, horoscope.getName(), horoscope.getScore());
            System.out.println(line);
            rank++;
        }
    }
}
