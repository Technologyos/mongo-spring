package com.technologyos.mongo.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentRequest implements Serializable {
   @NotBlank
   private String name;
   @NotBlank
   private String email;
}
