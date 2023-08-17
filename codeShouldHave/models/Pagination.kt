
import com.fasterxml.jackson.annotation.JsonProperty

data class Pagination(
    @JsonProperty var page: Int = 0,
    @JsonProperty var size: Int = 0
)

