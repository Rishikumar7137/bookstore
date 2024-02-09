package mindera.backendProject.bookStore.dto.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import static mindera.backendProject.bookStore.util.Messages.*;

public record PublisherCreateDto(

        @NotBlank(message = INVALID_PUBLISHER)
        @Size(max = 50, message = MAX_CHAR_SIZE)
        String name
) {
}
