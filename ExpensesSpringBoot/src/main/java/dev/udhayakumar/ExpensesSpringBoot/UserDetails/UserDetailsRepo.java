package dev.udhayakumar.ExpensesSpringBoot.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails,Long> {

}
