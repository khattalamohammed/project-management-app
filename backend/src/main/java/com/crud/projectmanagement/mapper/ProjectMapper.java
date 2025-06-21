package com.crud.projectmanagement.mapper;

import com.crud.projectmanagement.dto.ProjectDTO;
import com.crud.projectmanagement.entity.Project;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface ProjectMapper extends GenericMapper<Project, ProjectDTO> {

}

