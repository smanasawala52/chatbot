package com.chat.assistant.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chat.assistant.chatbot.model.mall.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
}