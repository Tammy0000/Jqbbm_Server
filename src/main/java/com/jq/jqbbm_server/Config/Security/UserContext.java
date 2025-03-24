package com.jq.jqbbm_server.Config.Security;

import org.springframework.security.core.userdetails.UserDetails;

public class UserContext {
    private final static ThreadLocal<UserDetails> userHolder = new ThreadLocal<>();

    public static void setUserDetails(UserDetails user) {
        userHolder.set(user);
    }

    public static String getUsername() {
        return userHolder.get().getUsername();
    }

    public static void clear() {
        userHolder.remove();
    }
}
