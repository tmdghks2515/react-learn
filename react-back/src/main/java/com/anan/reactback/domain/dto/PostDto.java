package com.anan.reactback.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostDto {
    private Long id;
    private int type;
    private String title;
    private String content;
    private MemberDto memberDto;

}
