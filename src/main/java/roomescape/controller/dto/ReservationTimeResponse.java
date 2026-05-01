package roomescape.controller.dto;

import java.time.LocalTime;

public record ReservationTimeResponse(
        Long id,
        LocalTime startAt
) {
}
