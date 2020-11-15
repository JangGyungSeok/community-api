package com.commu.backend.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_idx")
    Long id;

    @Column(name = "account_id")
    String account;

    @Column(name = "account_password")
    String password;

    @Column(name = "account_email")
    String email;

    @Column(name = "account_nickname")
    String nickname;

    @Column(name = "account_name")
    String name;

    @Column(name = "created_at")
    LocalDateTime createTs;



}eee
