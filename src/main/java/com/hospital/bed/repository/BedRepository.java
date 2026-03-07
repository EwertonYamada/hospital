package com.hospital.bed.repository;

import com.hospital.bed.model.Bed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BedRepository extends JpaRepository<Bed, Integer> {

    @Query(nativeQuery = true, value = """
    SELECT bed_number
    FROM bed
    ORDER BY bed_number DESC
    LIMIT 1
    """)
    Integer findLastBedNumber();
}
