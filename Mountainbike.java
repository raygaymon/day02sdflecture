package sg.edu.nus.iss;

public class Mountainbike extends Bicycle {
    public int seatHeight;

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public Mountainbike (int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeat Height " + seatHeight;
    }

    
}

