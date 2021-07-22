package com.example.quotes.controller;

import com.example.quotes.model.Quotes;
import com.example.quotes.service.QuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quote")
public class QuoteController {
    private final QuoteService quoteService;

    @GetMapping("/random")
    public Quotes getRandom(){

        return quoteService.getRandomQuote();
    }
    public Quotes getQuoteByGivenId(@RequestParam Long id){
        return quoteService.getQuoteByGivenId(id);
    }
    @GetMapping("/health")
    public String health(){
        return "Ok";
    }
}
