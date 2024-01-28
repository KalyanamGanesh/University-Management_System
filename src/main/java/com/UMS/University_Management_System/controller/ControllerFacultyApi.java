package com.UMS.University_Management_System.controller;

import org.springframework.web.bind.annotation.RestController;

import com.UMS.University_Management_System.entity.facultydetails;
import com.UMS.University_Management_System.service.facultyDetailsService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/facultydetails")
public class ControllerFacultyApi {
    facultyDetailsService facultydetailservice;

    public ControllerFacultyApi(facultyDetailsService facultydetailservice) {
        this.facultydetailservice = facultydetailservice;
    }

    @GetMapping
    public List<facultydetails> getAllFaculty() {
        return facultydetailservice.getAllFaculty();
    }

    @GetMapping("/{facultyId}")
    public facultydetails getFacultyDetail(@PathVariable Long facultyId) {
        return facultydetailservice.getFacultyDetail(facultyId);
    }

    @PostMapping
    public String createFacultyDetails(@RequestBody facultydetails facultydetail) {
        return facultydetailservice.createFacultyDetails(facultydetail);
    }

    @PutMapping("/{facultyId}")
    public String updateFacultyDetail(@PathVariable Long facultyId, @RequestBody facultydetails updatedfacultydetails) {
        return facultydetailservice.updateFacultyDetails(facultyId, updatedfacultydetails);
    }

    @DeleteMapping("/{facultyId}")
    public String deleteFacultyDetail(@PathVariable Long facultyId) {
        return facultydetailservice.deleteFacultyDetails(facultyId);
    }

}
