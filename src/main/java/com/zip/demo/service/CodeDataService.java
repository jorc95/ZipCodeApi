/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zip.demo.service;
import com.zip.demo.domain.CodeData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
/**
 *
 * @author T470P
 */
@Slf4j
public class CodeDataService {
//busca coincidencias en el archivo de lista de codigos zip     
   Resource resource=new ClassPathResource("static/zipCodeList/CPdescarga.txt");
   public List findCode(String zipCode) throws IOException{
       String row;
       String[] cells;
       List <CodeData> codesData=new ArrayList<>();
       try (BufferedReader CPlist = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
           while((row = CPlist.readLine()) != null){
               cells=row.split("\\|");
               if(cells[0].equals(zipCode)){
                   CodeData codeData=new CodeData();
                   codeData.setAll(cells);
                   codesData.add(codeData);
               }
           }
       }
    return codesData;
    }

}
