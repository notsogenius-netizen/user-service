package com.sourabh.user_service.service;

import com.sourabh.user_service.entities.History;
import com.sourabh.user_service.repository.HistoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public List<History> getTravelHistory(Long userId) {
        return historyRepository.findByUserId(userId);
    }
}
