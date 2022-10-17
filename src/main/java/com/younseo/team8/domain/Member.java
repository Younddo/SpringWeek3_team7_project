package com.younseo.team8.domain;

import com.younseo.team8.dto.request.MemberRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Builder
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Member extends com.younseo.team8.domain.TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String nickname;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

}
