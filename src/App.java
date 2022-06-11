import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar today = Calendar.getInstance();
        HoroscopeUseCase.printRanking(today);
    }
}
