package com.ednocel.redirectUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrlData {

    private String originalUrl;

    private long expirationTime;
}
