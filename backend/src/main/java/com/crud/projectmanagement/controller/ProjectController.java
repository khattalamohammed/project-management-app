package com.crud.projectmanagement.controller;

import com.crud.projectmanagement.dto.ProjectDTO;
import com.crud.projectmanagement.servcie.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectDTO>> getAll() {
        return ResponseEntity.ok(projectService.getAll());
    }

}
