package com.ocean.controller;

import com.ocean.pojo.Product;
import com.ocean.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

//    @RequestMapping("/products")
//    public Object products() {
//        List<Product> ps = productService.listProducts();
//        return ps;
////        return 3;
//    }

    @RequestMapping("/test")
    public Object test(String groupName,String remoteFileName) {
        System.out.println(groupName);
        System.out.println(remoteFileName);
        return 0;
//        return 3;
    }

    @RequestMapping("/products")
    public int products(@RequestParam("groupName") String groupName, @RequestParam("remoteGroupName") String remoteGroupName) {
        List<Product> ps = productService.listProducts();
        System.out.println(groupName);
        System.out.println(remoteGroupName);
        return 3;
//        return 3;
    }

    //    图片上传
//    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public Object upload(@RequestPart("file") MultipartFile file){
//        System.out.println(file);
//        return 222;
//    }
//
//    @PostMapping(value = "/upload1",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public Object upload1(MultipartFile file, HttpServletRequest request){
//        System.out.println(request);
//        System.out.println(file);
//        System.out.println(file.getName());
//        return 222;
//    }

    @PostMapping("upload2")
    public Object upload(@RequestPart("file") MultipartFile file,@RequestPart("imageInfo") Product product) {
        System.out.println(product);
//        MultipartFile multipartFile = new MultipartFile() {
//            @Override
//            public String getName() {
//                return null;
//            }
//
//            @Override
//            public String getOriginalFilename() {
//                return null;
//            }
//
//            @Override
//            public String getContentType() {
//                return null;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public long getSize() {
//                return 0;
//            }
//
//            @Override
//            public byte[] getBytes() throws IOException {
//                return new byte[0];
//            }
//
//            @Override
//            public InputStream getInputStream() throws IOException {
//                return null;
//            }
//
//            @Override
//            public void transferTo(File file) throws IOException, IllegalStateException {
//
//            }
//        };
//        try {
//            BufferedImage bufferedImage = ImageIO.read(multipartFile.getInputStream());
//            bufferedImage.get
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return product;
    }
}
