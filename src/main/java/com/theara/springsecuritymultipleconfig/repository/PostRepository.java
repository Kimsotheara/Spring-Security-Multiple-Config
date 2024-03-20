package com.theara.springsecuritymultipleconfig.repository;

import com.theara.springsecuritymultipleconfig.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
