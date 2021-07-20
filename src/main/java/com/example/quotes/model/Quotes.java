package com.example.quotes.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
public class Quotes {
    @Id
    private Long id;
    private String author;
    private String content;
}
