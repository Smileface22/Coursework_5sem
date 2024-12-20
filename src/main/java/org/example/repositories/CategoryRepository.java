package org.example.repositories;

import org.example.databases.Category;
import org.example.databases.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Category findByName(String name);
    List<Category> findByUser(User user);
}