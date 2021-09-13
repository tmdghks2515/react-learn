package com.anan.reactback.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MemberDto {
    private Long id;
    private String loginId;
    private String username;
    private int age;
    private List<PostDto> postDtos;
}
