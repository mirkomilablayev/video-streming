package com.example.videostreaming.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class LessonSource {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private File file;
}
