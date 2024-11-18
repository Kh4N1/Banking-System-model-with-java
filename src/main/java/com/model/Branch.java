package com.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "branches")
@Data
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String branchCode;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phoneNumber;

    private String managerName;

    @ManyToMany(mappedBy = "branches")
    private Set<Customer> customers;
}
