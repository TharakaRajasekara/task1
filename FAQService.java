package com.example.Task1.Service;

import com.example.Task1.Entity.FAQEntity;


import java.util.Date;
import java.util.List;
public interface FAQService {
    List<FAQEntity> getAllFAQs();

    FAQEntity createFAQ(FAQEntity faqEntity);

    void deleteFAQ(Long id);

    default FAQEntity updateFAQWithDate(Long id, FAQEntity faqEntity) {
        FAQEntity existingFAQ = updateFAQ(id,faqEntity);
        if (existingFAQ != null) {
            existingFAQ.setUpdateDate(new Date());
        }
        return existingFAQ;
    }

     FAQEntity updateFAQ(Long id, FAQEntity faq);
}
