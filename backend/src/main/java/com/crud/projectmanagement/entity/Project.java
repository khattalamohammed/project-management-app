package com.crud.projectmanagement.entity;

import com.crud.projectmanagement.entity.enums.ProjectStatus;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.time.LocalDate;

@Entity
@Table(name = "project")
@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseEntity {
    @Serial
    private static final long serialVersionUID = -5415245894289496208L;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProjectStatus status;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;
}
