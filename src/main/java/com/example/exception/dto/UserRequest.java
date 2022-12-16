package com.example.exception.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class UserRequest {

	@NotBlank(message = "username shouldn't be null or blank")
	private String name;
	@Email(message = "invalid email address")
	private String email;
	@NotNull
	@Pattern(regexp = "0-9", message = "invalid mobile number")
	private String mobile;
	@NotNull
	private String gender;
	@Min(18)
	@Max(50)
	private Integer age;
	@NotBlank
	private String nationality;

}
