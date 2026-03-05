package org.example.expert.domain.user.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.expert.domain.common.exception.InvalidRequestException;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;
    @NotBlank
    @Pattern(regexp = ".*\\d.*")
    @Pattern(regexp = ".*[A-Z].*")
    @Size(min=8)
    private String newPassword;

}
