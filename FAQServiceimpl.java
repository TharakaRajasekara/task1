package com.example.Task1.Service.IMPL;
import com.example.Task1.Entity.FAQEntity;
import com.example.Task1.Service.FAQService;
import com.example.Task1.Repository.FAQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class FAQServiceimpl implements FAQService {public List<FAQEntity> getAllFAQs() {
    return faqRepository.findAll();
}

    @Autowired
    private FAQRepository faqRepository;



    public FAQEntity createFAQ(FAQEntity faq) {
        return faqRepository.save(faq);
    }

    public FAQEntity updateFAQ(Long id, FAQEntity faq) {
        FAQEntity existingFAQ = faqRepository.findById(id).orElse(null);
        if (existingFAQ != null) {
            existingFAQ.setQuestion(faq.getQuestion());
            existingFAQ.setAnswer(faq.getAnswer());
            existingFAQ.setUpdateDate(new Date());
            return faqRepository.save(existingFAQ);
        }
        return null;
    }

    public void deleteFAQ(Long id) {
        faqRepository.deleteById(id);
    }
}
