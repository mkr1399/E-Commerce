package com.ecommerce.user_service.dto;

import com.ecommerce.user_service.entity.User;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String phNo;
    private User.Role role;
}