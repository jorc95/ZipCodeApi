/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zip.demo.control;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.zip.demo.service.CodeDataService;
import java.io.IOException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author T470P
 */
@RestController
@ResponseBody
public class Control {
    
    CodeDataService codeDataService=new CodeDataService();
    
    @GetMapping("/zip/{zipCode}") 
    public List zipSearch(@PathVariable String zipCode) throws IOException{
//        List <CodeData> codesData=new ArrayList<>();
//        codesData=codeDataService.findCode(zipCode);
        return codeDataService.findCode(zipCode);
    }
    
  
}