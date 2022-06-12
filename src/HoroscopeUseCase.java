import java.util.ArrayList;
import java.util.Calendar;

/**
 * 星座占いのユースケースに応じた機能を提供するクラス
 */
public class HoroscopeUseCase {
    /**
     * 星座占いランキングを出力する
     *
     * @param calendar       占いの日付
     * @param rankingPrinter 星座占いランキング出力インスタンス
     */
    public static void printRanking(Calendar calendar, IHoroscopeRankingPrinter rankingPrinter) {
        // 星座占い一覧を作成
        ArrayList<Horoscope> horoscopes = HoroscopeFactory.createAll(calendar);

        // ランキング出力
        rankingPrinter.print(horoscopes, calendar);
    }
}
