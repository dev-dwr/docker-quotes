package com.example.quotes.service;


import com.example.quotes.model.Quotes;
import com.example.quotes.repository.QuoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class QuoteService {
    private static final int MAX_QUOTES = 25;
    private final Random random = new Random();
    private final QuoteRepository quoteRepository;
    public Quotes getRandomQuote(){
        return quoteRepository.findById((long) random.nextInt(MAX_QUOTES) + 1).orElse(null);
    }
}
