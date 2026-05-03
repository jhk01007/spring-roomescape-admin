package roomescape.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import roomescape.controller.dto.request.ReservationTimeRequest;
import roomescape.controller.dto.response.ReservationTimeListResponse;
import roomescape.controller.dto.response.ReservationTimeResponse;
import roomescape.service.ReservationTimeService;


import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/times")
public class ReservationTimeController {

    private final ReservationTimeService reservationTimeService;

    public ReservationTimeController(ReservationTimeService reservationTimeService) {
        this.reservationTimeService = reservationTimeService;
    }

    @PostMapping
    public ResponseEntity<ReservationTimeResponse> addReservationTime(@RequestBody ReservationTimeRequest request) {
        return ResponseEntity.status(CREATED).body(reservationTimeService.addReservationTime(request));
    }

    @GetMapping
    public ResponseEntity<ReservationTimeListResponse> getReservationTimes() {
        return ResponseEntity.ok(new ReservationTimeListResponse(reservationTimeService.getReservationTimes()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservationTime(@PathVariable("id") Long id) {
        reservationTimeService.deleteReservationTime(id);
        return ResponseEntity.noContent().build();
    }

}
