package com.pes1ug20cs152.library.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.pes1ug20cs152.library.Model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}

