package com.example.Task1.controller;
import com.example.Task1.Entity.FAQEntity;
import com.example.Task1.Service.FAQService;
import com.example.Task1.dto.FAQDto;
import com.example.Task1.Service.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/faqs")
public class FAQController {
    @Autowired
    private FAQService faqService ;

    @GetMapping
    public List<FAQEntity> getAllFAQs() {
        return faqService.getAllFAQs();
    }

    @PostMapping
    public FAQEntity createFAQ(@RequestBody FAQEntity faq) {
        return faqService.createFAQ(faq);
    }

    @PutMapping("/{id}")
    public FAQEntity updateFAQ(@PathVariable Long id, @RequestBody FAQEntity faq) {
        return faqService.updateFAQ(id, faq);
    }

    @DeleteMapping("/{id}")
    public void deleteFAQ(@PathVariable Long id) {
        faqService.deleteFAQ(id);
    }
}
