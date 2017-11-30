package com.partum.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.HashSet;
import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {

//    认证方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("[FirstRealm]doGetAuthenticationInfo"+authenticationToken.hashCode());
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String  username = token.getUsername();
        System.out.println("从数据库中调用信息"+username+" ");

        if("unknown".equals(username)){
            throw  new UnknownAccountException("用户不存在");
        }
        if ("moster".equals(username)){
            throw new LockedAccountException("用户被锁定");
        }
        Object principal = username;
        Object credential = null;
        String realmName = getName();
        if("admin".equals(username)){
            credential="038bdaf98f2037b31f1e75b5b4c9b26e";
        }else if ("user".equals(username)){
            credential="098d2c478e9c11555ce2823231e02ec1";
        }
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal,credential,credentialsSalt,realmName);
        return info;
    }

    public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        Object credentials = "123456";
        Object salt = "user";
        Integer hashIterations = 1024;

        Object result =  new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
        System.out.println(result);
    }

//    授权方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        System.out.println("授权");
//       从PrincipalCollection中获取用户信息
        Object principal = principals.getPrimaryPrincipal();
//        利用登录的信息来和当前用户的角色或权限匹配
        Set<String> roles = new HashSet<>();
        roles.add("user");
        if ("admin".equals(principal)){
            roles.add("admin");
        }
//        创建SimpleAuthorizationInfo，并设置其roles属性
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
//        返回SimpleAuthorizationInfo
        return  info;
    }
}
