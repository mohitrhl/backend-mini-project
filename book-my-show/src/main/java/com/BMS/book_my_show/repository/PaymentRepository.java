package com.BMS.book_my_show.repository;

import com.BMS.book_my_show.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
    Optional<Payment> findByTransactionId(String transactionId);
}
