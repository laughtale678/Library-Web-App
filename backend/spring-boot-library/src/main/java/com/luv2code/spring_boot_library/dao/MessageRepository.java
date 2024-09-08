package com.luv2code.spring_boot_library.dao;

import com.luv2code.spring_boot_library.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface MessageRepository extends JpaRepository<Message, Long> {
    //for normal user find all the messages they've sent
    Page<Message> findByUserEmail(@RequestParam("user_email") String userEmail, Pageable pageable);

    //for admin to find messages from all users, closed and open
    Page<Message> findByClosed(@RequestParam("closed") boolean closed, Pageable pageable);

}
