package com.example.quotes.repository;

import com.example.quotes.model.Quotes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quotes, Long> {
}
