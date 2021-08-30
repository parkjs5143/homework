package com.koreait.day3.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminUserApiResponse {
    private Long id;
    private String userid;
    private String userpw;
    private String name;
    private String status;
    private LocalDateTime regDate;
}
