package Lab7_bai2;

public enum Enum_xuatXu {
    CHAU_A(0.95),
    CHUA_AU(1.5);

    private final double tiGia;

    private Enum_xuatXu(double tiGia) {
        this.tiGia = tiGia;
    }

    public double getTiGia() {
        return tiGia;
    }

}
