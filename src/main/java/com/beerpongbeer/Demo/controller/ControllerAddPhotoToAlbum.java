package com.beerpongbeer.Demo.controller;

import com.beerpongbeer.Demo.entity.Photo;
import com.beerpongbeer.Demo.entity.Student;
import com.beerpongbeer.Demo.repository.PhotoRepository;
import com.beerpongbeer.Demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerAddPhotoToAlbum {
    @GetMapping("/add-photo-to-album")
    public String addPhotoToAlbum() {
        addPhotoToAlbum("https://mimigram.ru/wp-content/themes/massive-dynamic/assets/img/Exitsite.jpg", 17);
        return "Photo added";
    }

    @Autowired
    StudentRepository studentRepository;


    public void addPhotoToAlbum(String url, long id) {
        Optional<Student> student = studentRepository.findById(id);

        student.map(st -> {
                    Photo photo = new Photo();
                    photo.setUrl(url);
                    photo.setStudent(st);
                    st.getPhotos().add(photo);
                    return studentRepository.save(st);
                })
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

}
