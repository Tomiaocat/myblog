package cn.tomiaocat.pojo.repository;

import cn.tomiaocat.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
