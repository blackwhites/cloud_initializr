package com.catify.initializr.services;

import com.catify.initializr.ServiceCreatorApplication;
import com.catify.initializr.domain.Domain;
import com.catify.initializr.domain.MicroService;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author claus
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ServiceCreatorApplication.class)
public class ServiceGeneratorServiceTest {
    
    @Autowired
    private ServiceGeneratorService service;
    
//    @Test
//    public void testCreateDomain() throws IOException{
//        System.out.println("createDomain");
//        Domain domain = new Domain("test", "com.foo.bar");
//        domain.addService(new MicroService("Service-A"));
//        domain.addService(new MicroService("Service-B"));
//        Iterable<Path> root = this.service.createDomain(domain).getRootDirectories();
//        for (Path path : root) {
//            Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
//
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                    System.out.println(file.toString());
//                    return FileVisitResult.CONTINUE;
//                }
//
//                @Override
//                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//                    System.out.println(dir.toString());
//                    return FileVisitResult.CONTINUE;
//                }
//                
//                
//            });
//        }
//    }
}
