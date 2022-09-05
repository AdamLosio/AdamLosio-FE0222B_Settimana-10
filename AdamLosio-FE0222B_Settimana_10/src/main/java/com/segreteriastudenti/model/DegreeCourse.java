package com.segreteriastudenti.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DegreeCourse {

	@NotNull
	@NotEmpty(message = "Campo necessario!")
	private String id;

	@NotNull
	@NotEmpty(message = "Campo necessario!")
	private String degreeName;

	private String degreeAddress;
	@NotNull
	@Min(10)
	@NotEmpty(message = "Campo necessario!")
	private Integer numberOfExams;

}
