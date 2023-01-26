/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bandevlab.securityjpa.repository;

import com.bandevlab.securityjpa.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author demon
 */
public interface PostRepository extends CrudRepository<Post,Long>{
    
}
