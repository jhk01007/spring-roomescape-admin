package roomescape.domain;


import java.time.LocalDate;

public class Reservation {
    private Long id;
    private String name;
    private LocalDate date;
    private ReservationTime reservationTime;

    public Reservation() { // Jackson이 Json -> Reservation으로 변환하는 과정에서 필요.
    }

    public Reservation(Long id, String name, LocalDate date, ReservationTime reservationTime) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.reservationTime = reservationTime;
    }

    public Reservation(String name, LocalDate date, ReservationTime reservationTime) {
        this.name = name;
        this.date = date;
        this.reservationTime = reservationTime;
    }

    public void bindId(long id) {
        if(this.id != null) {
            throw new RuntimeException("ID는 수정할 수 없습니다.");
        }
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public ReservationTime getReservationTime() {
        return reservationTime;
    }
}
