import ru.netology.services.CalcMonthToRestService;

public class Main {
    public static void main(String[] args) {
        CalcMonthToRestService service = new CalcMonthToRestService();

        System.out.println();
        System.out.println("ПЕРВЫЙ СЛУЧАЙ");
        System.out.println();

        int monthCounter = service.calculate(10_000, 3_000, 20_000);

        System.out.println(monthCounter + " месяцев(ца) в этом году можно не работать, а отдыхать");
        System.out.println();

        System.out.println();
        System.out.println("ВТОРОЙ СЛУЧАЙ");
        System.out.println();

        monthCounter = service.calculate(100_000, 60_000, 150_000);

        System.out.println(monthCounter + " месяцев(ца) в этом году можно не работать, а отдыхать");


    }


}
