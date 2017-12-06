package com.partum.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;

public class ShiroTextRealm extends AuthenticatingRealm {
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("2. "+authenticationToken.hashCode());
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String  username = token.getUsername();
        Object principal = username;
        Object credential = null;
        String realmName = getName();
        if ("admin".equals(username)){
            credential="123456";
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal,credential,realmName);
        return info;
    }
}
