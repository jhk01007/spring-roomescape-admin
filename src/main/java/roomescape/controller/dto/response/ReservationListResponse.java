package roomescape.controller.dto.response;

import java.util.List;

public record ReservationListResponse(
        List<ReservationResponse> reservations
) {
}
