package cc.jiaotu.jpatest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cc.jiaotu.jpatest.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>, JpaSpecificationExecutor<UserEntity>{
    Optional<UserEntity> findByUsername(String username);
}
