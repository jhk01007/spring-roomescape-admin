package roomescape.controller.dto.response;


import java.util.List;

public record ReservationTimeListResponse(
        List<ReservationTimeResponse> times
) {
}
