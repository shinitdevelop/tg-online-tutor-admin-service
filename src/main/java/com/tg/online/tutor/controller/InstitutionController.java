package com.tg.online.tutor.controller;

import com.tg.online.tutor.request.InstitutionRequest;
import com.tg.online.tutor.service.InstitutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api("Institution Controller")
@RestController
@RequestMapping(value = "/api/institution",consumes = MediaType.APPLICATION_JSON_VALUE)
public class InstitutionController {

    @Autowired
    InstitutionService institutionService;

    @ApiOperation(value = "Get Tests ", response = Iterable.class, tags = "getUsersTest")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "Not Authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not Found!") })
    @RequestMapping(value = "/getInstition",method = RequestMethod.GET)
    public ResponseEntity<Object> getUsersTest() {
        return ResponseEntity.status(HttpStatus.OK).body("Institution create success");
    }

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<?> saveInstitution(@RequestBody InstitutionRequest request){
        return institutionService.saveInstitution(request);
    }
}
