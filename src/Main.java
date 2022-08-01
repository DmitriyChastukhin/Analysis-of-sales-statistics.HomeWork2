public class Main {
    public static void main(String[] args) {
        int[] sales = {10, 14, 22, 18, 30, 26};
        SalesManager month = new SalesManager(sales);
        System.out.println(" Наибольшее количество реализованной продукции за месяц " + month.max());
    }
}
