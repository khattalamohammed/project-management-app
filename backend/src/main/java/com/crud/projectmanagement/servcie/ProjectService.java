package com.crud.projectmanagement.servcie;

import com.crud.projectmanagement.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {
    List<ProjectDTO> getAll();
}
