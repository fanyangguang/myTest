package com.fan.core.security;

public class SecurityContextHolder {

    final private static ThreadLocal<UserDetail> context = new ThreadLocal<>();

    final private static InheritableThreadLocal<UserDetail> parentContext = new InheritableThreadLocal<>();

    final public static UserDetail getUserDetail() {
        return context.get() != null ? context.get() : parentContext.get();
    }

    final public static void setUserDetail(UserDetail userDetail) {
        context.set(userDetail);
    }

    final public static void clear() {
        context.remove();
    }

}
