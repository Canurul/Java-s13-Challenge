/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main {


    public static void main(String[] args) {
        /*
        Healthplan healthplan1 = new Healthplan(5,"şeref","özel");
        Employee employee1 = new Employee(3000,"şeref","1234","aklsdjklasd",healthplan1);
        System.out.println(employee1);
        */
 Employee employee1 = new Employee(4, "okyanus", "1234", "sakndasd");
employee1.addHealthplan(4,"can");
 System.out.println(employee1);

    }
}