package com.ikem.hngfirsttask;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hng/profile")
public class ProfileController {

    @GetMapping
    public ResponseEntity<ProfileData> getProfileData() {
        return ResponseEntity.ok(
                ProfileData.builder()
                        .slackUsername("ikem")
                        .backend(true)
                        .age(24)
                        .bio("I use Springboot with Java for backend development.")
                        .build()
        );
    }
}
