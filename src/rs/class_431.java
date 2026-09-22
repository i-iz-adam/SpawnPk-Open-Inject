package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_431.class */
public class class_431 extends class_360 {
    public class_431(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(26700);
        c(26701, 0, "misc/BAG");
        a(26702, "misc/BAG", 1, 16, 16, "Close", 0, 26703, 1);
        a(26703, "misc/BAG", 2, 16, 16, 26704);
        a(26705, "Looting bag", this.a, 2, 16750848, true, true);
        b(26706, 4, 7, 13, 0);
        H[26706].W = new String[]{"Deposit 1", "Deposit 5", "Deposit 10", "Deposit All"};
        a(26707, "This bag is empty.", this.a, 1, 16750848, true, true);
        b(26708, 3, "misc/BAG", "Deposit all to bank");
        widgetD.k(7);
        widgetD.b(0, 26701, 9, 21);
        widgetD.b(1, 26702, 168, 4);
        widgetD.b(2, 26703, 168, 4);
        widgetD.b(3, 26705, 95, 4);
        widgetD.b(4, 26706, 12, 23);
        widgetD.b(5, 26707, 95, 113);
        widgetD.b(6, 26708, 10, 1);
    }
}
