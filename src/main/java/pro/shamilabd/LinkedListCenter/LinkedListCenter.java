package pro.shamilabd.LinkedListCenter;

public class LinkedListCenter {

    public static void main(String[] args) {
        LkList list5 = new LkList(5, null);
        LkList list4 = new LkList(4, list5);
        LkList list3 = new LkList(3, list4);
        LkList list2 = new LkList(2, list3);
        LkList list1 = new LkList(1, list2);
        System.out.println(getCenter(list1));
        LkList list26 = new LkList(6, null);
        LkList list25 = new LkList(5, list26);
        LkList list24 = new LkList(4, list25);
        LkList list23 = new LkList(3, list24);
        LkList list22 = new LkList(2, list23);
        LkList list21 = new LkList(1, list22);
        System.out.println(getCenter(list21));
        LkList list31 = new LkList(1, null);
        System.out.println(getCenter(list31));
        System.out.println(getCenter(null));
    }


    public static int getCenter(LkList list) {
        LkList result = list; // Возможно элементов 1 - это и будет нашим результатом
        boolean isOdd = true; // это нечетный элемент?
        while (list != null) {
            if (!isOdd) { // для нечетных будем брать следующий
                result = result.next;
            }
            list = list.next;
            isOdd = !isOdd;
        }
        return result == null ? -1 : result.val;
    }

//    public static int getCenter(LkList list) {
//        if (list == null) {
//            return -1;
//        }
//        if (list.next == null) {
//            return list.val;
//        }
//        LkList result = list; // Возможно элементов 1 - это и будет нашим результатом
//        boolean isEven = false; // это четный элемент?
//        while (list.next != null) {
//            list = list.next;
//            isEven = !isEven;
//            if (isEven) { // для четных будем брать следующий
//                result = result.next;
//            }
//        }
//        return result.val;
//    }

//    public static void main(String[] args) {
//        List<String> list1 = new LinkedList<>();
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        list1.add("4");
//        list1.add("5");
//        List<String> list2 = new LinkedList<>();
//        list2.add("1");
//        list2.add("2");
//        list2.add("3");
//        list2.add("4");
//        list2.add("5");
//        list2.add("6");
//        System.out.println(getCenter(list1));
//        System.out.println(getCenter(list2));
//        System.out.println(getCenter(new LinkedList<String>()));
//        List<String> list3 = new LinkedList<>();
//        list3.add("1");
//        System.out.println(getCenter(list3));
//
//    }
//
//    public static <T> T getCenter(List<T> list) {
//        if (list.isEmpty()) {
//            return null;
//        }
//        int pos = (int) Math.ceil(list.size() / 2.0);
//        if (list.size() % 2 == 0) {
//            pos++;
//        }
//        return list.get(pos - 1);
//    }
}