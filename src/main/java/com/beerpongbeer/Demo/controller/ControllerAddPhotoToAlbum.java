package com.beerpongbeer.Demo.controller;

import com.beerpongbeer.Demo.entity.Photo;
import com.beerpongbeer.Demo.entity.Student;
import com.beerpongbeer.Demo.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAddPhotoToAlbum {
    @GetMapping("/add-photo-to-album")
    public String addPhotoToAlbum() {
        addPhotoToAlbum("https://i0.wp.com/bunker158.com/wp-content/uploads/2017/07/groot-life-size-maquette-sideshow-2.jpg?fit=722%2C1000&ssl=1", 1);
        return "Photo added";
    }

    @Autowired
    PhotoRepository photoRepository;

    public void addPhotoToAlbum(String url, long id) {
        Photo photo = new Photo();
        Student student = new Student();
        photo.setUrl(url);
        photo.setStudent(student);
        photoRepository.save(photo);
    }
}
