package com.bc.user.model;

import lombok.*;

@RequiredArgsConstructor
public @Data class User {
    Long id;
    @NonNull
    String username;
    @NonNull
    String passwordHash;
}
