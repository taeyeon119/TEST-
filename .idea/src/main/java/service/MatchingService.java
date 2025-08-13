package com.example.yourproject.service;

import com.example.yourproject.domain.Matching;
import com.example.yourproject.repository.MatchingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchingService {

    private final MatchingRepository matchingRepository;

    public void deleteMatchById(Long matchId) {
        Matching match = matchingRepository.findById(matchId)
                .orElseThrow(() -> new ResourceNotFoundException("해당 매칭을 찾을 수 없습니다."));
        matchingRepository.delete(match);
    }
}
