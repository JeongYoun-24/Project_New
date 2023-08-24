package com.springboot.pople.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieRevDTO {

    private Long revid;

    private String userId;
    private Long movieId;

    private String revTitle;
    private String revContent;
    private int star;
    private LocalDateTime revDate;





}
