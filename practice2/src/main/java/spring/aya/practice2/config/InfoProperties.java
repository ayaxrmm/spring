package spring.aya.practice2.config;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app.info")
public record InfoProperties(
        @NotBlank String name,
        @Min(0) int age,
        @Min(1) int yearOfStudy
) {
}
