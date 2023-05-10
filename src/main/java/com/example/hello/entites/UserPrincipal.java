//
//package com.example.hello.entites;
//
//import java.util.Collection;
//import java.util.Objects;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.qlca.policeManagement.model.AccountModel;
//
//public class UserPrincipal implements UserDetails {
//	/**
//	 *
//	 */
//	private static final long serialVersionUID = 1L;
//
//	private String id;
//
//	private String username;
//
//	private String password;
//
//	private Boolean active;
//
//	private String name;
//
//	private String email;
//
//	private String roleId;
//
//	private Collection<? extends GrantedAuthority> authorities;
//
//	public UserPrincipal(String id, String username, String password, String email, String name, String roleId,
//			Collection<? extends GrantedAuthority> authorities) {
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.active = true;
//		this.email = email;
//		this.name = name;
//		this.roleId = roleId;
//		this.authorities = authorities;
//	}
//
//	public static UserPrincipal create(AccountModel account) {
//		return new UserPrincipal(account.getId(), account.getUsername(), account.getPassword(), account.getEmail(),
//				account.getName(), account.getRoleId(), null);
//	}
//
//	public String getRoleId() {
//		return roleId;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	@Override
//	public String getUsername() {
//		return username;
//	}
//
//	@Override
//	public String getPassword() {
//		return password;
//	}
//
//	public Boolean getActive() {
//		return active;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return authorities;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		if (active == true) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) {
//			return true;
//		}
//		if (o == null || getClass() != o.getClass()) {
//			return false;
//		}
//		UserPrincipal that = (UserPrincipal) o;
//		return Objects.equals(id, that.id);
//	}
//
//	@Override
//	public int hashCode() {
//
//		return Objects.hash(id);
//	}
//
//}
