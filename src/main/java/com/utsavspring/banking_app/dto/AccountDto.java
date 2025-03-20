package com.utsavspring.banking_app.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//public class AccountDto {
//    private Long id;
//    private String accountHolderName;
//    private double balance;

//record class helps transfer data btw client and server encapsulate related data without the need of boilerplate code
public record AccountDto(Long id,String accountHolderName,double balance) { }
