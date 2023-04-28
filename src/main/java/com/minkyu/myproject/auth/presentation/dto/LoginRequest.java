package com.minkyu.myproject.auth.presentation.dto;

import com.google.common.base.Preconditions;
import com.minkyu.myproject.user.domain.Email;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LoginRequest {

    @Schema(type = "string")
    private Email email;

    private String password;

    protected LoginRequest() {
    }

    public LoginRequest(Email email, String password) {
        Preconditions.checkArgument(email!=null, "email should be provided.");
        Preconditions.checkArgument(password != null, "password must be provided");

        this.email = email;
        this.password = password;
    }

    public Email getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("email", email)
                .append("password", password)
                .toString();
    }
}
