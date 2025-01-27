package pro.shamilabd.LinkedListCenter;

public class LkList {

    int val;

    LkList next;

    LkList() {
    }

    LkList(int val) {
        this.val = val;
    }

    LkList(int val, LkList next) {
        this.val = val;
        this.next = next;
    }
}