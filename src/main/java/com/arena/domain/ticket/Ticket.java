package com.arena.domain.ticket;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

public class Ticket {
    @Id
    @GeneratedValue
    private UUID id;

}
