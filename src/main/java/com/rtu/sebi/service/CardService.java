package com.rtu.sebi.service;

import com.rtu.sebi.dto.CardDetails;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public CardDetails getCardDetails(String customerNumber){

        return new CardDetails("Emre","Soylemez","12325345435", customerNumber);
    }
}
