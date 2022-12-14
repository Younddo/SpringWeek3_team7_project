package com.younseo.team8.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {
    private Long id;
    private String email;
    private String nickName;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
