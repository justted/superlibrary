package com.killtwo.superlibrary.repository;

import com.killtwo.superlibrary.entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Integer> {
}
