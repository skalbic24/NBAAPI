package com.NBA;

import org.springframework.data.jpa.repository.JpaRepository;

/**the I is looking for the ID and what type of repository, 
The ID what type of primary key is it. We can add more of our own
list of rules, ex.search by ID.
**/
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
