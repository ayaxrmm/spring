package spring.aya.practice2.config;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "greeting")

public record GreetingProperties(
        @NotBlank String message,
        @NotBlank String language,
        @Max(500) int maxLength
) {
}
