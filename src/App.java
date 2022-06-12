import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        // 今日の星座占いランキングをコンソールに出力
        Calendar today = Calendar.getInstance();
        IHoroscopeRankingPrinter rankingPrinter = new HoroscopeRankingConsole();
        HoroscopeUseCase.printRanking(today, rankingPrinter);
    }
}
