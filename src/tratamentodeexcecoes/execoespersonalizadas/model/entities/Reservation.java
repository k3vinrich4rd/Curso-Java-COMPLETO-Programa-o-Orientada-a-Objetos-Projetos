package tratamentodeexcecoes.execoespersonalizadas.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime(); //Diferença entre duas datas, milissegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);  //Converte milissegundos para dias
    }
    public void updateDates(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }


    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        return "Room " +
                roomNumber +
                ", check-in: " +
                sdf.format(checkIn) +
                ", checkout: " +
                sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";

    }
}
