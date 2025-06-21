package com.crud.projectmanagement.dto;

import com.crud.projectmanagement.constants.CommonConstants;
import com.crud.projectmanagement.entity.enums.ProjectStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record ProjectDTO(
        Long id,

        String name,

        String description,

        ProjectStatus status,

        @JsonFormat(pattern = CommonConstants.DATE_PATTERN)
        LocalDate startDate,

        @JsonFormat(pattern = CommonConstants.DATE_PATTERN)
        LocalDate endDate
) {}
