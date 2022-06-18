import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar today = Calendar.getInstance();
        IHoroscopeRankingPrinter rankingPrinter = new HoroscopeRankingConsole();
        HoroscopeUseCase.printRanking(today, rankingPrinter);
    }
}
