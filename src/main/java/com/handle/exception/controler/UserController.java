package com.handle.exception.controler;

import com.handle.exception.dto.UserRequestDTO;
import com.handle.exception.dto.UserResponseDTO;
import com.handle.exception.exception.CustomException;
import com.handle.exception.util.ErrorMessageEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("user")
public class UserController {


    @PostMapping
    public ResponseEntity<UserResponseDTO> create(@RequestBody UserRequestDTO userRequestDTO) throws CustomException {

        if (Objects.isNull(userRequestDTO.getName())) {
            throw new CustomException(ErrorMessageEnum.ERROR_NAME_NUL.getMessageKey());
        }
        return ResponseEntity.ok().build();
    }
}
