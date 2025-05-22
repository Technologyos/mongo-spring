package com.technologyos.mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "student")
public class Student {
   @Id
   private String studentId;
   private String name;
   @Indexed(unique = true)
   private String email;
}
