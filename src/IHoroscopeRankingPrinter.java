import java.util.ArrayList;
import java.util.Calendar;

/**
 * 星座占いランキング出力インターフェース
 */
public interface IHoroscopeRankingPrinter {
    /**
     * 星座占いランキングを出力する
     *
     * @param horoscopes 出力する星座占いのリスト
     * @param calendar   出力対象日付
     */
    void print(ArrayList<Horoscope> horoscopes, Calendar calendar);
}
