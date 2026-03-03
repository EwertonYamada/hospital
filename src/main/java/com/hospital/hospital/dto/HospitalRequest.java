package com.hospital.hospital.dto;

public record HospitalRequest(
   String name,
   String cnpj,
   String phoneNumber
) {}
