package eshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eshopping.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	@Query("select a from Account a where a.emailid = :emailid")		// write custom query when not looking for something that's a primary key.
																		// emailid is NOT a primary key in Account table
	public Account findAccountDetails(@Param("emailid") String emailid);

}
