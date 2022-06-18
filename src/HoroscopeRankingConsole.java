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
        Comparator<Horoscope> comparator = (horoscope1, horoscope2) -> horoscope1.getScore().compareTo(horoscope2.getScore()) * -1;

        Collections.sort(horoscopes, comparator);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("----- " + dateFormatter.format(calendar.getTime()) + " 星座占い -----");

        int rank = 1;
        for (Horoscope horoscope : horoscopes) {
            String line = String.format("第%d位: %s (スコア: %d)", rank, horoscope.getName(), horoscope.getScore());
            System.out.println(line);
            rank++;
        }
    }
}
