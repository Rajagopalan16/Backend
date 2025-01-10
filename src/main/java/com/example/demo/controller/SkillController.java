package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTOs.SkillDTO;
import com.example.demo.entity.Skill;
import com.example.demo.service.SkillService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public ResponseEntity<List<Skill>> getAllSkills() {
        return new ResponseEntity<>(skillService.getAllSkills(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skill> createSkill(@Valid @RequestBody SkillDTO skillDto) {
        Skill skill = new Skill();
        skill.setName(skillDto.getName());
        skill.setDescription(skillDto.getDescription());

        return new ResponseEntity<>(skillService.saveSkill(skill), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Skill> updateSkill(@PathVariable Long id, @Valid @RequestBody SkillDTO skillDto) {
        Skill skill = skillService.getSkillById(id);
        skill.setName(skillDto.getName());
        skill.setDescription(skillDto.getDescription());

        return new ResponseEntity<>(skillService.saveSkill(skill), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
