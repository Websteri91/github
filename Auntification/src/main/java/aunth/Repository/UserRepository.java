package aunth.Repository;


import aunth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>  {

    @Query("select b from User b where b.username = :username")
    User findByUsername(@Param("username") String username);
}
