package com.crud.projectmanagement.servcie.impl;

import com.crud.projectmanagement.dto.ProjectDTO;
import com.crud.projectmanagement.entity.Project;
import com.crud.projectmanagement.mapper.ProjectMapper;
import com.crud.projectmanagement.repository.ProjectRepository;
import com.crud.projectmanagement.servcie.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    public List<ProjectDTO> getAll() {
        List<Project> projects = projectRepository.findAll();
        return projectMapper.toDTOList(projects);
    }
}
