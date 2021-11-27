package com.assessment.icinbank.checkbook;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckBookService {

    private final CheckBookRepository checkBookRepository;

    public List<CheckBook> getAllCheckBooks(){
        return checkBookRepository.findAllByStatus(false);
    }

    public void grantCheckBook(Long userId) {
       CheckBook checkBook =  checkBookRepository.findByUserId(userId);
       checkBook.setCheckBookStatus(true);
       checkBookRepository.save(checkBook);
    }
}
