package com.example.project.service;

import com.example.project.repository.MatchingRepository;
import org.springframework.stereotype.Service;

@Service
public class MatchingService {

    private final MatchingRepository matchingRepository;

    public MatchingService(MatchingRepository matchingRepository) {
        this.matchingRepository = matchingRepository;
    }

    public void deleteMatchingById(Long id) {
        if (!matchingRepository.existsById(id)) {
            throw new IllegalArgumentException("해당 매칭이 존재하지 않습니다.");
        }
        matchingRepository.deleteById(id);
    }
}
