package com.hospital.room.repository;

import com.hospital.room.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query(nativeQuery = true, value = """
    SELECT CAST(regexp_replace(code, '[^0-9]', '', 'g') AS INTEGER)
    FROM room
    WHERE code ~ '[0-9]'
    ORDER BY CAST(regexp_replace(code, '[^0-9]', '', 'g') AS INTEGER) DESC
    LIMIT 1
    """)
    Integer findLastRoomNumber();
}
