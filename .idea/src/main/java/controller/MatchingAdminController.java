package com.example.project.controller;

import com.example.project.service.MatchingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/matchings")
public class MatchingAdminController {

    private final MatchingService matchingService;

    public MatchingAdminController(MatchingService matchingService) {
        this.matchingService = matchingService;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatching(@PathVariable Long id) {
        matchingService.deleteMatchingById(id);
        return ResponseEntity.noContent().build(); // 204 No Content 응답
    }
}
