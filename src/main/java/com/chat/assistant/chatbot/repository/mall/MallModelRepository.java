package com.chat.assistant.chatbot.repository.mall;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chat.assistant.chatbot.model.mall.MallModel;

@Repository
public interface MallModelRepository extends JpaRepository<MallModel, Long> {
}
