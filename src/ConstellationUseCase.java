import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

/**
 * 星座占いのユースケースに応じた機能を提供するクラス
 */
public class ConstellationUseCase {
    /**
     * 星座占いランキングを出力する
     *
     * @param calendar 占いの日付
     */
    public static void printRanking(Calendar calendar) {
        // 星座占い一覧を作成
        ArrayList<Constellation> constellations = ConstellationFactory.createAll(calendar);

        // ソート用の比較オブジェクトを用意
        Comparator<Constellation> comparator = new Comparator<Constellation>() {
            @Override
            public int compare(Constellation c1, Constellation c2) {
                return c1.getScore().compareTo(c2.getScore());
            }
        };

        // ソート
        Collections.sort(constellations, comparator);

        // 日付を出力
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("----- " + dateFormatter.format(calendar.getTime()) + " 星座占い -----");

        // ランキングを出力
        int rank = 1;
        for (Constellation constellation : constellations) {
            String line = String.format("第%d位: %s (スコア: %d)", rank, constellation.getName(), constellation.getScore());
            System.out.println(line);
            rank++;
        }
    }
}
