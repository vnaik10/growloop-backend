package com.growloop.growloop_backend.authentication.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BagCreateRequest {
    @NotBlank(message = "Bag name is required")
    @Size(min = 2, max = 100, message = "Bag name must be between 2 and 100 characters")
    private String bagName;
}
