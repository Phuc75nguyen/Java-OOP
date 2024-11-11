package Tuan3.Bai3;




public class Coordinate {
    int x;
    int y;
    //Constructor mac dinh
    Coordinate(){
        x = 0;
        y = 0;
    }
    //Constructor co tham so
    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    //tinh tong 2 toa do
    Coordinate tong (Coordinate a, Coordinate b){
            Coordinate c = new Coordinate();
            c.x = a.x + b.x;
            c.y = a.y + b.y;
            return c;
    }
    //tim diem doi xung
    Coordinate doiXung(Coordinate a){
            Coordinate c = new Coordinate();
            c.x = 0 - a.x;
            c.y = 0 - a.y;
            return c;
    }
    //in
    void display(){
        System.out.println("Toa do cua diem la: " + "(" + x +";" + y + ")");
    }
}
