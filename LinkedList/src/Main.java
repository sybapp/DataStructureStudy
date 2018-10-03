public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.addLast(3);
        link.addLast(3);
        link.addLast(7);
        link.addLast(38);
        link.addLast(39);
        System.out.println(link);
        link.add(2, 5);
        System.out.println(link);
        link.remove(5);
        System.out.println(link.getSize());
        System.out.println(link);

    }
}
