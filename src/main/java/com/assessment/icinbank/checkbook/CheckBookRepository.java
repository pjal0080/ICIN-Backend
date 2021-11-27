package com.assessment.icinbank.checkbook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckBookRepository extends JpaRepository<CheckBook,Long> {

    @Query(value = "SELECT * FROM checkbooks WHERE user_id=:userId",nativeQuery = true)
    CheckBook findByUserId(@Param("userId") Long userId);

    @Query(value = "SELECT * FROM checkbooks WHERE status=:status",nativeQuery = true)
    List<CheckBook> findAllByStatus(@Param("status") Boolean status);

}
