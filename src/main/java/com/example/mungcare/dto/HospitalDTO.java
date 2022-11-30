package com.example.mungcare.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HospitalDTO {
    private Integer hNo; //병원 정보 번호
    private String hName; //병원 이름
    private String address; //병원 주소
    private String latitude; //위도
    private String longitude; //경도
}
