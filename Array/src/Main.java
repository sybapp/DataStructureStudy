public class Main {

    public static void main(String[] args) {
        Array arr = new Array();
        for (int i = 0; i < 20; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(20, 45);
        System.out.println(arr);
        arr.removeElement(45);
        System.out.println(arr);
    }
}
