package com.homedirect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homedirect.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	Account findByUserName(String name);

	Account findByAccountNumber(String accountNumber);

	Account findByUserNameAndPassWord(String userName, String passWord);
}
