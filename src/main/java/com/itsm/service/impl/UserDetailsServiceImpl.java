//package com.itsm.service;
//
//import com.itsm.dao.UserRoleDao;
//import com.itsm.entity.Role;
//import com.itsm.entity.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private UserRoleDao userRoleDao;
//
//        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRoleDao.findByUsername(username);
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
//
//        for (Role role : user.getRoleSet()) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
//    }
//}
