package com.digi.accounting.model;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class EventApiClientRegistration {

    String event;
    String registeredForApi;
}
