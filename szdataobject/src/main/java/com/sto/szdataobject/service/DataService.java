package com.sto.szdataobject.service;

import com.sto.szdataobject.model.pojo.priceDao;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;

public interface DataService {

    int importData(MultipartFile file) throws IOException;

    int importDataCollect(MultipartFile file) throws IOException;


    int increasePrice();
}
