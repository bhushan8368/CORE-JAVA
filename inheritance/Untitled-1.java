
class book {
    private int pgno;

    void setpgno(int x) {
        pgno = x;
    }

    int getpgno() {
        return pgno;
    }
}

public class constructor {
    public static void main(String[] args) {
        book b = new book();
        b.setpgno(100);
        System.out.println(b.getpgno());
    }
}
